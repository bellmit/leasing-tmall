package com.hshc.relay.service;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.hshc.relay.dao.CustomerDao;
import com.hshc.relay.entity.riskcontrol.Customer;
import com.qimencloud.api.DefaultQimenCloudClient;
import com.qimencloud.api.QimenCloudClient;
import com.qimencloud.api.sceneo67v8y8p21.request.HshcRiskControlCustomerReturnRequest;
import com.qimencloud.api.sceneo67v8y8p21.response.HshcRiskControlCustomerReturnResponse;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TmallCarLeaseRiskcallbackRequest;
import com.taobao.api.response.TmallCarLeaseRiskcallbackResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationAdapter;
import org.springframework.transaction.support.TransactionSynchronizationManager;

/**
 * @author 钟林俊
 * @version V1.0 2017-05-07 16:54
 */
@Service
public class RiskControlService extends BaseService<Customer> {

    @Autowired
    private AuthorizedSessionService authorizedSessionService;
    @Autowired
    private CustomerDao customerDao;

    /**
     * 增加客户申请信息
     *
     * @param customer 客户申请信息
     * @return 数据库新增影响的行数
     */
    @Transactional(rollbackFor = Exception.class)
    public int add(final Customer customer){
        // 客户对象不能为空
        Preconditions.checkNotNull(customer, "accepted customer is null");
        // debug日志
        logger.debug("risk-control customer :" + JSON.toJSONString(customer));
        // 持久化
        int rows = baseDao.insert(customer);

        // 事务提交后执行 将客户信息发送给租赁系统
        TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronizationAdapter() {
            @Override
            public void afterCommit() {
                QimenCloudClient cloudClient = new DefaultQimenCloudClient(getReturnUrl(), getAppKey(), getAppSecret());
                HshcRiskControlCustomerReturnRequest request = new HshcRiskControlCustomerReturnRequest();
                request.setConsigneeAddress(customer.getAddr());
                request.setIdentityNo(customer.getIdentityNo());
                request.setMobile(customer.getMobile());
                request.setName(customer.getName());
//                request.setItemId(customer.getItemId());
                request.setTargetAppKey(getAppKey());

                try {
                    HshcRiskControlCustomerReturnResponse response = cloudClient.execute(request);
                    // 发送成功后更新成功发送的标记
                    if(response.getSuccess() != null && response.getSuccess()){
                        customer.setReturned(true);
                        modify(customer);
                    }
                } catch (ApiException e) {
                    logger.error("", e);
                }
            }
        });

        return rows;

    }

    /**
     * 风控结果发送天猫
     *
     * @param uuid 客户申请号
     * @return 天猫响应结果
     * @throws ApiException
     */
    public TmallCarLeaseRiskcallbackResponse.Result sendRiskControlResult(String uuid) throws ApiException {
        // uuid必须有值
        Preconditions.checkArgument(!Strings.isNullOrEmpty(uuid), "the given uuid is null");
        Customer customer = new Customer();
        customer.setUuid(uuid);
        // 根据uuid查询对应的客户信息
        TmallCarLeaseRiskcallbackRequest.CreditInfoTopDto topDto = customerDao.selectTopDto(customer);
        // 没有相应客户抛异常退出
        Preconditions.checkNotNull(topDto, "no customer matches the given uuid " + uuid);
        // 客户风控默认通过
        topDto.setPass(true);

        // 发送天猫
        TaobaoClient client = new DefaultTaobaoClient(getTopApi(), getAppKey(), getAppSecret());
        TmallCarLeaseRiskcallbackRequest req = new TmallCarLeaseRiskcallbackRequest();
        req.setCreditInfo(topDto);
        TmallCarLeaseRiskcallbackResponse.Result result = client.execute(req, authorizedSessionService.getAuthorizedSession("sandbox_taobao1234").getAccessToken()).getResult();
        // 回调日志记录
        logger.info("risk control callback : request=" + JSON.toJSONString(topDto) + ", resposne=" + JSON.toJSONString(result));
        return result;
    }
}

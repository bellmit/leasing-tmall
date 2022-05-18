package com.hshc.relay.controller.erp;

import com.hshc.relay.annotation.QimenSignAuthentication;
import com.hshc.relay.controller.BaseController;
import com.hshc.relay.vo.BaseQimenResponseVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 钟林俊
 * @version V1.0 2017-05-06 11:01
 */
@Controller
public class QimenTestController extends BaseController{

    @RequestMapping("/lease-plans")
    @ResponseBody
    @QimenSignAuthentication
    public BaseQimenResponseVo syncLeasePlans(@RequestParam("item_id") Integer itemId, @RequestParam(value = "plans", required = false) String plans){
        logger.info("itemId:" + itemId);
        logger.info("plans:" + plans);
        //业务逻辑
        //处理
        return new BaseQimenResponseVo("同步成功!");
    }


}

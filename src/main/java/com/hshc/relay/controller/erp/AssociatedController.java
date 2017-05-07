package com.hshc.relay.controller.erp;

import com.hshc.relay.vo.BaseQimenResponseVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 创建IC商品与后端商品的映射关系
 * @author  王华英
 * @version  V1.0 2017年5月6日17:14:48
 */
@Controller
public class AssociatedController {
    private static Logger LOGGER= LoggerFactory.getLogger(AssociatedController.class);

    @RequestMapping("lease-associat")
    @ResponseBody
    public BaseQimenResponseVo addAssociated(@RequestParam("item_id")Integer itemId ){
        LOGGER.info("itemId:"+itemId);
        return new BaseQimenResponseVo("查询成功");
    }

}
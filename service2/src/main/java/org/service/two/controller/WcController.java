package org.service.two.controller;

import org.service.two.entity.WcEntity;
import org.service.two.service.WcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @DATA 2019-04-25 15:33
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@RestController
public class WcController {

    @Autowired
    WcService xmService;
    @RequestMapping("/update")
    public String add()
    {

        xmService.update();
        return "扣除库存成功";
    }

}

package org.service.one.controller;

import org.service.one.entity.XmEntity;
import org.service.one.service.StockFeginService;
import org.service.one.service.XmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @DATA 2019-04-25 15:33
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@RestController
public class XmController {

    @Autowired
    XmService xmService;



    @RequestMapping("/add")
    public String add()
    {
        xmService.save();

        return "success";
    }

}

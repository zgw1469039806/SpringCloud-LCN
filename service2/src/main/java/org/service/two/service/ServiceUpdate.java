package org.service.two.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @DATA 2019-04-25 16:09
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@RequestMapping("/Service")
public interface ServiceUpdate {


    @GetMapping("/update")
    public void update();
}

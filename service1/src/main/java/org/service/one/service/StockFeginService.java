package org.service.one.service;

import org.service.two.entity.WcEntity;
import org.service.two.service.ServiceUpdate;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @DATA 2019-04-25 16:06
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@FeignClient("service2")
public interface StockFeginService  extends ServiceUpdate {

}

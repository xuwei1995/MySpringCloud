package com.xuwei.member.service;

import com.xuwei.member.service.impl.MemberFeignService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author doublev
 * order-server 为订单服务在Eureka 注册中心注册的订单服务
 */
@Service
@FeignClient(name = "order-server",fallback= MemberFeignService.class)
public interface OrderFeign {
    /**
     * 由member通过Feign RPC通信 调用到order服务 这里并不关心url 因为交管给了注册中心
     * @return 订单test
     */
    @RequestMapping("/orderTest")
    @ResponseBody
    String orderTest();
}

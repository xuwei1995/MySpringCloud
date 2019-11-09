package com.xuwei.member.controller;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.xuwei.member.service.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {
    @Autowired
    private OrderFeign orderFeign;


    @RequestMapping("/memberRequestOrderResult")
    @ResponseBody
    public String orderTest() {
        return orderFeign.orderTest();
    }
}

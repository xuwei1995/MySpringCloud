package com.xuwei.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {

    @RequestMapping("/orderTest")
    @ResponseBody
    public String orderTest() {
        return "this is order test";
    }

}

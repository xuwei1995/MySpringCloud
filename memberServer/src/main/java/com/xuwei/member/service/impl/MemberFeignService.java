package com.xuwei.member.service.impl;

import com.xuwei.member.service.OrderFeign;
import org.springframework.stereotype.Component;

/**
 * @author reed
 */
@Component
public class MemberFeignService implements OrderFeign {
    @Override
    public String orderTest() {
        return "Oh! Error!";
    }


}

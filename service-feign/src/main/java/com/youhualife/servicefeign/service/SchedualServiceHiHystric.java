package com.youhualife.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author hunji
 * @date 2018/7/2
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "使用了熔断器，显示错误"+name;
    }
}

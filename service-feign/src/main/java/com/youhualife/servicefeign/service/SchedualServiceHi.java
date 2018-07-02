package com.youhualife.servicefeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hunji
 * @date 2018/7/2
 */
@FeignClient(value="service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    /**
     * @param name 传入参数
     * @return
     */
    @RequestMapping(value="/hi",method=RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}

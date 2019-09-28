package com.opslab.springboot.serviceconsumer.restinterface;

import com.opslab.springboot.serviceconsumer.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="springcloud-service-provider",configuration =FeignConfig.class )
public interface IHelloRemote {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name") String name);
}

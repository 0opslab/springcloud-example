package com.opslab.springboot.serviceconsumer.controller;

import com.opslab.springboot.serviceconsumer.restinterface.IHelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private IHelloRemote iHelloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return iHelloRemote.hello(name);
    }
}

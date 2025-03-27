package com.ds.sofa.boot.provider.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import com.ds.sofa.boot.provider.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ds
 * @date 2025/3/27
 * @description
 */
@RequestMapping("test")
@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @RequestMapping("hello")
    public Map<String, Object> hello(String name) {
        String msg = helloService.sayHello(name);
        Map<String, Object> result = new HashMap<>();
        result.put("code", 200);
        result.put("msg", msg);
        return result;
    }

}

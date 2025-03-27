package com.ds.sofa.boot.consumer.controller;

import java.util.HashMap;
import java.util.Map;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import com.ds.sofa.boot.provider.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ds
 * @date 2025/3/26 23:27
 */
@RequestMapping("test")
@RestController
public class HelloController {

    @SofaReference(uniqueId = "${service.unique.id}", binding = @SofaReferenceBinding(bindingType = "bolt"))
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

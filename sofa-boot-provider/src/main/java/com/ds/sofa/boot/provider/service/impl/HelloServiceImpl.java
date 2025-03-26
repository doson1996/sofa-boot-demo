package com.ds.sofa.boot.provider.service.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.ds.sofa.boot.provider.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author ds
 * @date 2025/3/26 23:23
 */
@Service
@SofaService( interfaceType = HelloService.class, bindings = {@SofaServiceBinding(bindingType = "bolt")})
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello" + name;
    }
}

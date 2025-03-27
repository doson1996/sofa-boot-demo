package com.ds.sofa.boot.provider.service;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ds
 * @date 2025/3/26 23:22
 */
@FeignClient(value = "provider", path = "test")
public interface HelloFeignClient {

    @GetMapping("/hello")
    Map<String, Object> sayHello(@RequestParam("name") String name);

}
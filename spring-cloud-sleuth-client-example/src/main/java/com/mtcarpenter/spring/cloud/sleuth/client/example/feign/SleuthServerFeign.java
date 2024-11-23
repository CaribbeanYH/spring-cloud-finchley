package com.mtcarpenter.spring.cloud.sleuth.client.example.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author mtcarpenter
 * @github git@github.com:CaribbeanYH/microservices.git
 * @desc 微信公众号：山间木匠
 */
@FeignClient(name = "sleuth-server", path = "server")
public interface SleuthServerFeign {

    @GetMapping("/sayHello")
    String sayHello();

    @GetMapping("/error")
    String error();
}
package com.mtcarpenter.getway.cloud.server.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @author mtcarpenter
 * @github git@github.com:CaribbeanYH/microservices.git
 * @desc 微信公众号：山间木匠
 */
@RestController
@RequestMapping("/route")
public class RouteTestController {

    @GetMapping(value = "")
    public String hello() {
        return "8090:hello";
    }

    @GetMapping(value = "/sayHello/{name}")
    public String sayHello(@PathVariable String name) {
        return "8090:sayHello:" + name;
    }

    @GetMapping(value = "/cookie")
    public String cookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        return "8090:cookie:" + cookies;
    }


}

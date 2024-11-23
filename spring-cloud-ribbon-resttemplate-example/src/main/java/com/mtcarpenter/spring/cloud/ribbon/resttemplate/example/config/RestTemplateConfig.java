package com.mtcarpenter.spring.cloud.ribbon.resttemplate.example.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author mtcarpenter
 * @github git@github.com:CaribbeanYH/microservices.git
 * @desc 微信公众号：山间木匠
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}

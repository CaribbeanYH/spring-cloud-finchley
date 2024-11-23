package com.mtcarpenter.rabbitmq.example.direct;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author mtcarpenter
 * @github git@github.com:CaribbeanYH/microservices.git
 * @desc 微信公众号：山间木匠
 */
@Configuration
public class DirectConfig {

    @Bean
    public Queue queue(){
        return new Queue("direct.queue",true);
    }

}
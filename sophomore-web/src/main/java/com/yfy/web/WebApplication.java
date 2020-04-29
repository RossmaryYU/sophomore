package com.yfy.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * <p>
 *     web端启动类
 * </p>
 *
 * @author yfy
 * @version 1.0
 * @date 2020/4/29
 */
@SpringBootApplication
@EnableDiscoveryClient
@FeignClient
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class,args);
    }
}

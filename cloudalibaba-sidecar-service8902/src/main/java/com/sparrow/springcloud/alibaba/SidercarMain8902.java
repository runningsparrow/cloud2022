package com.sparrow.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther zzyy
 * @create 2020-02-23 14:12
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SidercarMain8902
{
    public static void main(String[] args) {
            SpringApplication.run(SidercarMain8902.class, args);
    }
}

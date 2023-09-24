package com.sparrow.springcloud.alibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @auther sparrow
 * @create 2023-08-16 14:13
 */
@RestController
@Slf4j
public class Sidercar2Controller
{
    @Resource
    private RestTemplate restTemplate;

//    @Value("${server.port}")
//    private String serverPort;

    @GetMapping(value = "/sidercar/flask/health")
    public String getSiderhealth()
    {
        return restTemplate.getForObject("http://localhost:5002/health", String.class);
    }


    @GetMapping(value = "/sidercar/flask/home")
    public String getflaskhome()
    {
        return restTemplate.getForObject("http://localhost:5002/", String.class);
    }

    @GetMapping(value = "/sidercar/flask/home/test1")
    public String getflasktest1()
    {
        return restTemplate.getForObject("http://localhost:5002/test1", String.class);
    }
}

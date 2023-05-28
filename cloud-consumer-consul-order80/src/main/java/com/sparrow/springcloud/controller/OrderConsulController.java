package com.sparrow.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.UUID;

@RestController
@Slf4j
public class OrderConsulController {

    public static final String INVOKE_URL = "http://consul-provider-payment";

//    public static final String INVOKE_URL = "http://127.0.0.1:8006";
    @Resource
    private RestTemplate restTemplate;


    /**
     * http://localhost/consumer/payment/consul
     *
     * @return
     */
    @RequestMapping(value = "/consumer/payment/consul", method = RequestMethod.GET)
    public String paymentInfo() {
//        return "springcloud with consul: "+"\t   "+ UUID.randomUUID().toString();
        return restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
    }

}

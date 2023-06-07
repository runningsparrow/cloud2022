package com.sparrow.springcloud.controller;

import com.sparrow.springcloud.entities.CommonResult;
import com.sparrow.springcloud.entities.Payment;
import com.sparrow.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther zzyy
 * @create 2020-02-22 11:17
 */
@RestController
public class SendMessageController
{
    @Resource
    private IMessageProvider messageProvider;

    //测试访问 http://localhost:8801/sendMessage
    @GetMapping(value = "/sendMessage")
//    public String sendMessage()
    public CommonResult<Payment> sendMessage()
    {

//        return messageProvider.send();
//        messageProvider.send();
        return new CommonResult(200,"生产者:  "+ messageProvider.send(),null);
    }

}

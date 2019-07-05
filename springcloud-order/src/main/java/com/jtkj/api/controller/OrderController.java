package com.jtkj.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 于得水 on 2019/7/5.
 * User: yudeshui 1003870732@qq.com
 * Date: 2019/7/5
 * Time: 18:33
 * Version: springcloud20 1.0.0.0
 * [功能描述].
 */
@RestController
public class OrderController {

    //restTemplate 是由springboot web组件提供的
    //rest方式 底层是使用Httpclient技术的
    @Autowired
    private RestTemplate restTemplate;
    /**
     * 在springcloud 中有两种方式调用 rest  fegin其他服务
     * @return
     */
    //订单服务调用会员服务
    public String getOrder(){

        return "";
    }
}

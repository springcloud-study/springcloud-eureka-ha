package com.zhihao.miao.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Value("${user.service.url}")
    private String userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/order")
    public String index(){
        String response = restTemplate.getForEntity(userService+"/user",String.class).getBody();
        System.out.println(response);
        return response;
    }
}

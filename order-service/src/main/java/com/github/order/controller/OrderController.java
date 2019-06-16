package com.github.order.controller;

import com.github.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService ;

    @RequestMapping("/order/getUser")
    public List<Map<String,String>> getUser(){
        return orderService.getUserByRest();

    }



}

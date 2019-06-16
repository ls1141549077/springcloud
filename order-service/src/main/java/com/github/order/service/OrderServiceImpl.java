package com.github.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private RestTemplate restTemplate;


    @Override
    public List<Map<String, String>> getUserByRest() {
        List forObject = restTemplate.getForObject("http://member-service/member/getUserList", List.class);
        return forObject;
    }
}

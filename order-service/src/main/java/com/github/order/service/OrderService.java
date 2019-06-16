package com.github.order.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface OrderService {
    List<Map<String,String>> getUserByRest();
}

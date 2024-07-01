package com.example.spring_drools.controller;

import com.example.spring_drools.entity.Orders;
import com.example.spring_drools.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public Orders createOrder(@RequestBody Orders order) {
        orderService.processOrder(order);
        return order;
    }
}
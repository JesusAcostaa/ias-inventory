package com.iasinventory.application.controller;

import com.iasinventory.domain.models.Order;
import com.iasinventory.domain.usecase.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/iasinventory/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/getall")
    public List<Order> getAllOrder(){
        return orderService.getAllOrders();
    }

    @PostMapping()
    public Order createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }




}

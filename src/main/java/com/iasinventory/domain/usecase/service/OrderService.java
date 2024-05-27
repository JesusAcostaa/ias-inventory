package com.iasinventory.domain.usecase.service;

import com.iasinventory.domain.models.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAllOrders();

    Order createOrder(Order order);

}

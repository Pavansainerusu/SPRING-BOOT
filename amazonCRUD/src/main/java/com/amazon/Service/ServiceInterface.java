package com.amazon.Service;

import java.util.List;

import com.amazon.Model.Orders;

public interface ServiceInterface {
	Orders saveOrders(Orders orders);
    List<Orders> getAllOrders();
    Orders getOrdersById(String ordersId);
    void deleteOrders(String ordersId);
    Orders updateOrders(String ordersId, Orders orders);
}

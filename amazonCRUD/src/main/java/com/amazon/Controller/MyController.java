package com.amazon.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.amazon.Model.Orders;
import com.amazon.Service.ServiceInterface;

@RestController
@RequestMapping("/orders")
public class MyController {
@Autowired
private ServiceInterface service;

@GetMapping
public List<Orders> getAllOrders() {
    return service.getAllOrders();
}
@GetMapping("/{orderId}")
public ResponseEntity<Orders> getOrdersById(@PathVariable String ordersId) {
    Orders orders = service.getOrdersById(ordersId);
    if (orders != null) {
        return ResponseEntity.ok(orders);
    }
    return ResponseEntity.notFound().build();
}
// POST order
@PostMapping
public Orders createOrders(@RequestBody Orders orders) {
    return service.saveOrders(orders);
}


//PUT order (update)
@PutMapping("/{orderId}")
public ResponseEntity<Orders> updateOrders(@PathVariable String ordersId, @RequestBody Orders orders) {
    Orders updatedOrders = service.updateOrders(ordersId, orders);
    if (updatedOrders != null) {
        return ResponseEntity.ok(updatedOrders);
    }
    return ResponseEntity.notFound().build();
}
//DELETE order
@DeleteMapping("/{ordersId}")
public ResponseEntity<Void> deleteOrders(@PathVariable String ordersId) {
    service.deleteOrders(ordersId);
    return ResponseEntity.noContent().build();
}
}

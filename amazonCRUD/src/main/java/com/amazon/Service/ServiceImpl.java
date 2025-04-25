package com.amazon.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.Model.Orders;
import com.amazon.Repository.Dao;
@Service
public class ServiceImpl implements ServiceInterface {

	 @Autowired
	    private Dao dao;
	@Override
	public Orders saveOrders(Orders orders) {
		// TODO Auto-generated method stub
		return dao.save(orders);
	}

	@Override
	public List<Orders> getAllOrders() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Orders getOrdersById(String ordersId) {
		// TODO Auto-generated method stub
		Optional<Orders> orders = dao.findById(ordersId);
		return orders.orElse(null);
	}

	@Override
	public void deleteOrders(String ordersId) {
		// TODO Auto-generated method stub
		dao.deleteById(ordersId);
		
	}

	@Override
	public Orders updateOrders(String ordersId, Orders orders) {
		// TODO Auto-generated method stub
		if (dao.existsById(ordersId)) {
            orders.setOrderId(ordersId);
            return dao.save(orders);
        }
        return null;
	}

}

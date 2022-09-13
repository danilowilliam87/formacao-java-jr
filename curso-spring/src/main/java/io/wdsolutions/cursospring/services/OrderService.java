package io.wdsolutions.cursospring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.wdsolutions.cursospring.entities.Order;
import io.wdsolutions.cursospring.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	
	public Order findById(Long id) {
		Order order = this.repository.findById(id).get();
		return order;
	}
	
	public List<Order> findAll(){
		return this.repository.findAll();
	}
}

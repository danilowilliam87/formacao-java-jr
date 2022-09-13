package io.wdsolutions.cursospring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.wdsolutions.cursospring.entities.Order;
import io.wdsolutions.cursospring.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable(value = "id")  Long id){
		Order order = this.service.findById(id);
		return ResponseEntity.ok().body(order);
	}
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> orders = this.service.findAll();
		return ResponseEntity.ok().body(orders);
	}

}

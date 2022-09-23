package io.wdsolutions.cursospring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.wdsolutions.cursospring.entities.Product;
import io.wdsolutions.cursospring.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public Product findById(Long id) {
		Product product = this.repository.findById(id).get();
		return product;
	}

	public List<Product> findAll() {
		return this.repository.findAll();
	}
}

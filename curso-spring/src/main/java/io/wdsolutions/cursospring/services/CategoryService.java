package io.wdsolutions.cursospring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.wdsolutions.cursospring.entities.Category;
import io.wdsolutions.cursospring.entities.Order;
import io.wdsolutions.cursospring.repository.CategoryRepository;
import io.wdsolutions.cursospring.repository.OrderRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	
	public Category findById(Long id) {
		Category category = this.repository.findById(id).get();
		return category;
	}
	
	public List<Category> findAll(){
		return this.repository.findAll();
	}
}

package io.wdsolutions.cursospring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.wdsolutions.cursospring.entities.Category;
import io.wdsolutions.cursospring.entities.Order;
import io.wdsolutions.cursospring.services.CategoryService;
import io.wdsolutions.cursospring.services.OrderService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable(value = "id")  Long id){
		Category category = this.service.findById(id);
		return ResponseEntity.ok().body(category);
	}
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> categories = this.service.findAll();
		return ResponseEntity.ok().body(categories);
	}

}

package io.wdsolutions.cursospring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.wdsolutions.cursospring.entities.Product;
import io.wdsolutions.cursospring.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable(value = "id")  Long id){
		Product product= this.service.findById(id);
		return ResponseEntity.ok().body(product);
	}
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> categories = this.service.findAll();
		return ResponseEntity.ok().body(categories);
	}

}

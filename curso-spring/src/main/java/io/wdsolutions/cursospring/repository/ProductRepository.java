package io.wdsolutions.cursospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.wdsolutions.cursospring.entities.Category;
import io.wdsolutions.cursospring.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}

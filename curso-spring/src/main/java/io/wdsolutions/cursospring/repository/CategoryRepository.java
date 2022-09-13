package io.wdsolutions.cursospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.wdsolutions.cursospring.entities.Category;
import io.wdsolutions.cursospring.entities.Order;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}

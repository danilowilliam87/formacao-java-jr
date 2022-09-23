package io.wdsolutions.cursospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.wdsolutions.cursospring.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}

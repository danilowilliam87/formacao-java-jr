package io.wdsolutions.cursospring.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.wdsolutions.cursospring.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	Optional<User> findByName(String name);
	Optional<User> findByEmail(String email);
	List<User> findByNameLike(String name);
	
}

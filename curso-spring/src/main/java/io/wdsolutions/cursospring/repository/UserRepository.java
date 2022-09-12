package io.wdsolutions.cursospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.wdsolutions.cursospring.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}

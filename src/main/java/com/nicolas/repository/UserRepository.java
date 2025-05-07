package com.nicolas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nicolas.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}

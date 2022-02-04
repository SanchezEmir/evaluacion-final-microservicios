package com.sanchezemir.sanchezemirpizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanchezemir.sanchezemirpizza.entity.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer>{
	
	

}

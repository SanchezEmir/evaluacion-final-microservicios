package com.sanchezemir.sanchezemirpizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanchezemir.sanchezemirpizzeria.entity.Pizzeria;

@Repository
public interface PizzeriaRepository extends JpaRepository<Pizzeria, Integer>{
	
	

}

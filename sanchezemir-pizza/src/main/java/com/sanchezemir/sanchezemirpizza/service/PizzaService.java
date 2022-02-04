package com.sanchezemir.sanchezemirpizza.service;

import java.util.List;

import com.sanchezemir.sanchezemirpizza.dto.PizzaDTO;

public interface PizzaService {
	
	List<PizzaDTO> listar();
	void crear(PizzaDTO pizza);
	void eliminar(Integer id);

}

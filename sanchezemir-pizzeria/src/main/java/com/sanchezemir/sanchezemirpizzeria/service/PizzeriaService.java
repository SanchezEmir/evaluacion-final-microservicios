package com.sanchezemir.sanchezemirpizzeria.service;

import java.util.List;

import com.sanchezemir.sanchezemirpizzeria.dto.PizzeriaDTO;

public interface PizzeriaService {
	
	List<PizzeriaDTO> listar();
	void crear(PizzeriaDTO pizzeria);
	void eliminar(Integer id);

}

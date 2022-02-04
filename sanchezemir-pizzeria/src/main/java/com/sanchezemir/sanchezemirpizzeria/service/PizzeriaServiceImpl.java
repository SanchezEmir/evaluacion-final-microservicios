package com.sanchezemir.sanchezemirpizzeria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanchezemir.sanchezemirpizzeria.dto.PizzeriaDTO;
import com.sanchezemir.sanchezemirpizzeria.mapper.PizzeriaRequestMapper;
import com.sanchezemir.sanchezemirpizzeria.mapper.PizzeriaResponseMapper;
import com.sanchezemir.sanchezemirpizzeria.repository.PizzeriaRepository;


@Service
public class PizzeriaServiceImpl implements PizzeriaService{
	
	@Autowired
	private PizzeriaRepository repo;
	@Autowired
	private PizzeriaRequestMapper erqm;
	@Autowired
	private PizzeriaResponseMapper erpm;

	@Override
	public List<PizzeriaDTO> listar() {
		// TODO Auto-generated method stub
		return erpm.listarPizzeriaDTOlist(repo.findAll());
	}

	@Override
	public void crear(PizzeriaDTO pizzeria) {
		// TODO Auto-generated method stub
		repo.save(erqm.pizzeriaEntity(pizzeria));
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}

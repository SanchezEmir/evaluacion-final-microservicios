package com.sanchezemir.sanchezemirpizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanchezemir.sanchezemirpizza.dto.PizzaDTO;
import com.sanchezemir.sanchezemirpizza.mapper.PizzaRequestMapper;
import com.sanchezemir.sanchezemirpizza.mapper.PizzaResponseMapper;
import com.sanchezemir.sanchezemirpizza.repository.PizzaRepository;


@Service
public class PizzaServiceImpl implements PizzaService{
	
	@Autowired
	private PizzaRepository repo;
	@Autowired
	private PizzaRequestMapper erqm;
	@Autowired
	private PizzaResponseMapper erpm;

	@Override
	public List<PizzaDTO> listar() {
		// TODO Auto-generated method stub
		return erpm.listarPizzaDTOlist(repo.findAll());
	}

	@Override
	public void crear(PizzaDTO pizza) {
		// TODO Auto-generated method stub
		repo.save(erqm.pizzaEntity(pizza));
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}

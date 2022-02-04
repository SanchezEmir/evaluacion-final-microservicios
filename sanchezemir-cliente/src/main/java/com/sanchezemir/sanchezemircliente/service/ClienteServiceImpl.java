package com.sanchezemir.sanchezemircliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanchezemir.sanchezemircliente.dto.ClienteDTO;
import com.sanchezemir.sanchezemircliente.mapper.ClienteRequestMapper;
import com.sanchezemir.sanchezemircliente.mapper.ClienteResponseMapper;
import com.sanchezemir.sanchezemircliente.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteRepository repo;
	@Autowired
	private ClienteRequestMapper erqm;
	@Autowired
	private ClienteResponseMapper erpm;

	@Override
	public List<ClienteDTO> listar() {
		// TODO Auto-generated method stub
		return erpm.listarClienteDTOlist(repo.findAll());
	}

	@Override
	public void crear(ClienteDTO cliente) {
		// TODO Auto-generated method stub
		repo.save(erqm.clienteEntity(cliente));
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}

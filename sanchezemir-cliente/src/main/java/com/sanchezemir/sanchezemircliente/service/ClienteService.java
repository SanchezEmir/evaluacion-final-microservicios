package com.sanchezemir.sanchezemircliente.service;

import java.util.List;

import com.sanchezemir.sanchezemircliente.dto.ClienteDTO;

public interface ClienteService {
	
	List<ClienteDTO> listar();
	void crear(ClienteDTO cliente);
	void eliminar(Integer id);

}

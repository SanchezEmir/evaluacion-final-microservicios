package com.sanchezemir.openfeing.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.sanchezemir.openfeing.entity.Cliente;

@FeignClient(name = "sanchezemir-cliente", url = "localhost:8080")
public interface OpenFeingClient {
	
	@GetMapping("/api/cliente/listar")
	public List<Cliente> listarCliente();

}

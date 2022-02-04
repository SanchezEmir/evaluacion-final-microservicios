package com.sanchezemir.sanchezemircliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sanchezemir.sanchezemircliente.dto.ClienteDTO;
import com.sanchezemir.sanchezemircliente.service.ClienteService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@Api(tags = "Cliente API")
@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	@ApiOperation(value = "Listar clientes", notes = "Listar clientes")
	@ApiResponses(value = {
			@ApiResponse(code = 401, message = "No existe"),
			@ApiResponse(code = 201, message = "creado")
	})
	@GetMapping("/listar")
	public @ResponseBody List<ClienteDTO> listarCliente(){
		return service.listar();
	}
	
	@ApiOperation(value = "Crear clientes", notes = "Crear clientes")
	@PostMapping("/crear")
	public void crearCliente(@RequestBody ClienteDTO dto) {
		service.crear(dto);
	}
	
	@ApiOperation(value = "Eliminar clientes", notes = "Eliminar clientes")
	@DeleteMapping("/eliminar/{id}")
	public void eliminarCliente(@PathVariable Integer id) {
		service.eliminar(id);
	}

}

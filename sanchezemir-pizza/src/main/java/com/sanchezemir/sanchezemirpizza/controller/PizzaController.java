package com.sanchezemir.sanchezemirpizza.controller;

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

import com.sanchezemir.sanchezemirpizza.dto.PizzaDTO;
import com.sanchezemir.sanchezemirpizza.service.PizzaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@Api(tags = "Pizza API")
@RestController
@RequestMapping("/api/pizza")
public class PizzaController {
	
	@Autowired
	private PizzaService service;
	
	@ApiOperation(value = "Listar pizza", notes = "Listar pizza")
	@ApiResponses(value = {
			@ApiResponse(code = 401, message = "No existe"),
			@ApiResponse(code = 201, message = "creado")
	})
	@GetMapping("/listar")
	public @ResponseBody List<PizzaDTO> listarPizza(){
		return service.listar();
	}
	
	@ApiOperation(value = "Crear pizza", notes = "Crear pizza")
	@PostMapping("/crear")
	public void crearPizza(@RequestBody PizzaDTO dto) {
		service.crear(dto);
	}
	
	@ApiOperation(value = "Eliminar pizza", notes = "Eliminar pizza")
	@DeleteMapping("/eliminar/{id}")
	public void eliminarPizza(@PathVariable Integer id) {
		service.eliminar(id);
	}

}

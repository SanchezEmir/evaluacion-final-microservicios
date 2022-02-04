package com.sanchezemir.openfeing.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanchezemir.openfeing.entity.Delivery;
import com.sanchezemir.openfeing.service.DeliveryService;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {
	
	@Autowired
	private DeliveryService service;
	
	@GetMapping("/listar")
	public List<Delivery> asignarDelivery(){
		return service.asignarDelivery();
	}

}

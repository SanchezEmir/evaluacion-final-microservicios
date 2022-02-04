package com.sanchezemir.openfeing.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sanchezemir.openfeing.client.OpenFeingClient;
import com.sanchezemir.openfeing.entity.Delivery;

public class DeliveryServiceImpl implements DeliveryService{
	
	@Autowired
	private OpenFeingClient cliente;

	@Override
	public List<Delivery> asignarDelivery() {
		List<Delivery> listarDelivery = new ArrayList<>();
		Delivery delivery = new Delivery();
		delivery.setDelivery("Manolito Aliaga");
		delivery.setListadoCliente(cliente.listarCliente());
		listarDelivery.add(delivery);
		
		return listarDelivery;
	}

}

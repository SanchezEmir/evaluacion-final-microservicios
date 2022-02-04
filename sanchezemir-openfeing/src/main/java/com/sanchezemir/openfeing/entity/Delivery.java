package com.sanchezemir.openfeing.entity;

import java.util.List;

public class Delivery {
	
	List<Cliente> listadoCliente;
	String delivery;
	
	public List<Cliente> getListadoCliente() {
		return listadoCliente;
	}
	public void setListadoCliente(List<Cliente> listadoCliente) {
		this.listadoCliente = listadoCliente;
	}
	public String getDelivery() {
		return delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}
	
	
}

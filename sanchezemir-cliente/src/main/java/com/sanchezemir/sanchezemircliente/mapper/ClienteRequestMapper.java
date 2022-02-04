package com.sanchezemir.sanchezemircliente.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.sanchezemir.sanchezemircliente.dto.ClienteDTO;
import com.sanchezemir.sanchezemircliente.entity.Cliente;

@Mapper(componentModel = "spring")
public interface ClienteRequestMapper {
	
	@Mappings(value = {
			@Mapping(source = "idCli", target = "idCliente"),
			@Mapping(source = "nombreCli", target = "nombreCliente"),
			@Mapping(source = "apellidoCli", target = "apellidoCliente"),
			@Mapping(source = "nroCelu", target = "nroCelular"),
			@Mapping(source = "direc", target = "direccion")
	})
	Cliente clienteEntity(ClienteDTO cliente);

}

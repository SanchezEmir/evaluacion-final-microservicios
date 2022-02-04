package com.sanchezemir.sanchezemircliente.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.sanchezemir.sanchezemircliente.dto.ClienteDTO;
import com.sanchezemir.sanchezemircliente.entity.Cliente;

@Mapper(componentModel = "spring")
public interface ClienteResponseMapper {
	
	@Mappings(value = {
			@Mapping(source = "idCliente", target = "idCli"),
			@Mapping(source = "nombreCliente", target = "nombreCli"),
			@Mapping(source = "apellidoCliente", target = "apellidoCli"),
			@Mapping(source = "nroCelular", target = "nroCelu"),
			@Mapping(source = "direccion", target = "direc")
	})
	ClienteDTO clienteDTO(Cliente estudiante);

	
	List<ClienteDTO> listarClienteDTOlist(List<Cliente> listar);

}

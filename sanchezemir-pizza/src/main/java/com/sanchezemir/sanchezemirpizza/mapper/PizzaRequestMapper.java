package com.sanchezemir.sanchezemirpizza.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.sanchezemir.sanchezemirpizza.dto.PizzaDTO;
import com.sanchezemir.sanchezemirpizza.entity.Pizza;

@Mapper(componentModel = "spring")
public interface PizzaRequestMapper {
	
	@Mappings(value = {
			@Mapping(source = "idPiz", target = "idPizza"),
			@Mapping(source = "nombrePiz", target = "nombrePizza"),
			@Mapping(source = "desc", target = "descripcion")
	})
	Pizza pizzaEntity(PizzaDTO pizza);

}

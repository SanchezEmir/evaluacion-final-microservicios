package com.sanchezemir.sanchezemirpizza.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.sanchezemir.sanchezemirpizza.dto.PizzaDTO;
import com.sanchezemir.sanchezemirpizza.entity.Pizza;

@Mapper(componentModel = "spring")
public interface PizzaResponseMapper {
	
	@Mappings(value = {
			@Mapping(source = "idPizza", target = "idPiz"),
			@Mapping(source = "nombrePizza", target = "nombrePiz"),
			@Mapping(source = "descripcion", target = "desc")
	})
	PizzaDTO pizzaDTO(Pizza pizza);

	
	List<PizzaDTO> listarPizzaDTOlist(List<Pizza> listar);

}

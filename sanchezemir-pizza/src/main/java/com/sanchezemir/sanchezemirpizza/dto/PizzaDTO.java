package com.sanchezemir.sanchezemirpizza.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description = "Modelo DTO Pizza")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PizzaDTO {
	
	@ApiModelProperty(required = true, example = "1",name = "id",value = "ID de la Pizza")
	private Integer idPiz;
	private String nombrePiz;
	private String desc;

}

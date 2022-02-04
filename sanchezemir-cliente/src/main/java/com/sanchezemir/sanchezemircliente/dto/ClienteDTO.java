package com.sanchezemir.sanchezemircliente.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description = "Modelo DTO Estudiante")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {
	
	@ApiModelProperty(required = true, example = "1",name = "id",value = "ID del CLIENTE")
	private Integer idCli;
	private String nombreCli;
	private String apellidoCli;
	private String nroCelu;
	private String direc;

}

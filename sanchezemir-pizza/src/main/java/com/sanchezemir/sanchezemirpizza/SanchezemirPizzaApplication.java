package com.sanchezemir.sanchezemirpizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@EnableEurekaClient
@SpringBootApplication
public class SanchezemirPizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SanchezemirPizzaApplication.class, args);
	}
	
	//Define todo los detalles que tendra la API
			private ApiInfo apiInfo() {
				return new ApiInfoBuilder().title("API de una pizza")
						.description("La API servira para listar, eliminar, actualizar pizza")
						.termsOfServiceUrl("http://emirsanchez.com")
						.contact(new Contact("Emir Sanchez", "", "emir2104@gmail.com"))
						.license("Emir Sanchez")
						.licenseUrl("http://emirsanchez.com")
						.version("1.0.0.")
						.build();
			}
		
			//Define la configuración para swagger
			@Bean
			public Docket petApi() {
				return new Docket(DocumentationType.SWAGGER_2)
						.groupName("Evaluacion Final API-2")
						.apiInfo(apiInfo())
						.select()
						.apis(RequestHandlerSelectors.basePackage("com.sanchezemir.sanchezemirpizza"))
						.paths(PathSelectors.any())
						.build()
						.tags(new Tag("Pizza API","Mostrar todas las APIS"));
						
			}

}

package com.sanchezemir.apiserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SanchezemirApiserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SanchezemirApiserverApplication.class, args);
	}

}

package com.sanchezemir.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SanchezemirConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SanchezemirConfigServerApplication.class, args);
	}

}

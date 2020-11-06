package com.amisno.infragateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InfraGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfraGatewayApplication.class, args);
	}

}

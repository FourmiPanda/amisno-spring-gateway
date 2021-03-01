package com.amisno.infragateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name= "server", configuration = RibbonConfiguration.class)
public class InfraGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfraGatewayApplication.class, args);
	}

}

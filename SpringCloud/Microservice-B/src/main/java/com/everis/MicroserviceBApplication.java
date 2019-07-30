package com.everis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviceBApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBApplication.class, args);
	}

}

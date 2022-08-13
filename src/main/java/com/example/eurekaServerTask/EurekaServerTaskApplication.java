package com.example.eurekaServerTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerTaskApplication.class, args);
	}

}

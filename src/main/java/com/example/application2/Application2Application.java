package com.example.application2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class Application2Application {

	public static void main(String[] args) {
		SpringApplication.run(Application2Application.class, args);
	}

}

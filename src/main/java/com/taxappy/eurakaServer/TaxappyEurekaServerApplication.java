package com.taxappy.eurakaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TaxappyEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxappyEurekaServerApplication.class, args);
	}

}

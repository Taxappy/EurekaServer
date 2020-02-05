package com.taxapy.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TaxapyEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxapyEurekaServerApplication.class, args);
	}

}

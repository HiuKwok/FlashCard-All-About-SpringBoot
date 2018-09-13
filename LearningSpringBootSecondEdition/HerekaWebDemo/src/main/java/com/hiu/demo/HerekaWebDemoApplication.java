package com.hiu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//All the comment and foot note are referencing Learning Spring Boot2.0 text book
// Full reference is on project readme page

@SpringBootApplication
/**
 * Tell Spring Cloud Eureka that we want to run Eureka Server
 */
@EnableEurekaServer
public class HerekaWebDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerekaWebDemoApplication.class, args);
	}
}

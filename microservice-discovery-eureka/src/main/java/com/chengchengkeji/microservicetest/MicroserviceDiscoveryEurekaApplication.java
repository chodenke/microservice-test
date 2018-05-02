package com.chengchengkeji.microservicetest;


import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringCloudApplication
@EnableEurekaServer
public class MicroserviceDiscoveryEurekaApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDiscoveryEurekaApplication.class, args);
	}
}

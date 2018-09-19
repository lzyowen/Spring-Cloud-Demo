package com.student2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class StudentService2Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentService2Application.class, args);
	}
}

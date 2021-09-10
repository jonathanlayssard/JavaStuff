package com.revature.TodoSpringBootAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com.revature")
@EntityScan(basePackages="com.revature")
@EnableJpaRepositories(basePackages="com.revature")
public class TodoSpringBootApiApplication {
 
	/*
	 * Spring Boot brings back the Main method
	 */
	public static void main(String[] args) {
		SpringApplication.run(TodoSpringBootApiApplication.class, args);
	}
}

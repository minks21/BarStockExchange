package com.mayank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// to tell spring boot applications as where to find the repositories
@EnableJpaRepositories(value = "com.mayank.repository")
// to tell spring boot as where are my models
@EntityScan("com.mayank.model")
// ComponentScan is used to tell where all the components are present
// spring boot application automatically includes componentScan
// while in spring we have to add it seperatley
//@ComponentScan(value = "com.mayank")
public class BarstockexchangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarstockexchangeApplication.class, args);
	}

}

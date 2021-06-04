package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		//initialises the container
		//we have to specify which object to create when this container gets init
		
		ConfigurableApplicationContext context = SpringApplication.run(FirstSpringBootApplication.class, args);
		
		System.out.println("Welcome to boot");
		//this is called deoendancy injection
		Alien a1 = context.getBean(Alien.class);
		a1.show();
	}

}

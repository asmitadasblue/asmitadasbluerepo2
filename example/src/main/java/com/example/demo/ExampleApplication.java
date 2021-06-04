package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext context = SpringApplication.run(ExampleApplication.class, args);
	Customer c = (Customer)context.getBean(Customer.class);
	c.display(); // so we anotate the customer clas with @Component for spring container to know it is  aspring bean
	// and we will call it by getBean
	
	//now we will see autowire connection between components with help of spring boot
	}

}

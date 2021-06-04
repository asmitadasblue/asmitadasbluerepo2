package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoAutowireApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoAutowireApplication.class, args);
		Alien a = ctx.getBean(Alien.class);
		//a object is dependant on l1.
		//we have to connect alien and laptop or else alien wont know that they need laptop for 
		
		a.show();
	}

}

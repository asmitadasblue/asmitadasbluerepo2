package com.edureka.Edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("Customer.xml");
		// get the bean from the xml
		CustomerService cust = (CustomerService)context.getBean("CustomerServiceProxy");
		
        System.out.println( "******************************" );
        cust.printName();
        cust.printURL();
        System.out.println("*******************************");
        try {
        	cust.printThrowException();
        	
        }catch(Exception e) {
        	
        }
    }
}

package com.edureka.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Operation e = (Operation) context.getBean("opBean");
        
        System.out.println("calling msg method of Operation class ");
        e.msg();
        System.out.println("calling m method ");
        e.m();
        System.out.println("calling k method");
        e.k();
        
    }
}

package com.edureka.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect

public class Track {
	@Pointcut("execution(* Operation.m*(..))")
	public void k(){}//pointcut name
	
	//applying pointcut on beforeAdvice
	@Before("k()")
	
	public void myadvice(JoinPoint jp) // this is basically what is the advice what methoid needs to run as before advice
	{
		System.out.println("This is the concern");
	}
	
	

}

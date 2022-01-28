package com.suntech;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.suntech.AppConfig;
import com.suntech.HelloService;

public class Main 
{
	public static void main(String[] args) 
	{
		AbstractApplicationContext con=new AnnotationConfigApplicationContext(AppConfig.class);
		
		HelloService service=(HelloService) con.getBean("hello");
		
		service.hello();
		
	}

}
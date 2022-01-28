package com.suntech;

import org.springframework.stereotype.Component;

@Component("hello")
public class HelloService 
{
	public void hello() 
	{
		System.out.println("hello suntech");
	}

}
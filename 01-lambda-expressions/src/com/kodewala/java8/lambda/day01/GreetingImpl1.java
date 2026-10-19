package com.kodewala.java8.lambda.day01;

public class GreetingImpl1 implements Greeting {

	@Override
	public String greet(String name) {
		
		return "Hello, welcom " + name;
	}
	
}

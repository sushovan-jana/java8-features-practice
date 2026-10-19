package com.kodewala.java8.lambda.day01;
/**
 * Here, we are not using the implemented class
 * not creating any object, directly using lamda expression
 * writing concise code 
 */
public class GreetingImpl2 {
	public static void main(String[] args) {
		Greeting greeting = (name) -> "Hello, welcome " +  name;
		String message = greeting.greet("Sushvoan");
		System.out.println(message);
		
		String message2 = greeting.greet("Soham");
		System.out.println(message2);
	}
}

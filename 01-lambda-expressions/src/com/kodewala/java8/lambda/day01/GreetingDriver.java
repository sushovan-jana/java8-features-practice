package com.kodewala.java8.lambda.day01;
/**
 * Here the problem is to implement one method we are using one implemented class then calling the method
 * here, we need GreetingImpl1 class to call the method
 */
public class GreetingDriver {
	public static void main(String[] args) {
		GreetingImpl1 greetingImpl1 = new GreetingImpl1();
		String message = greetingImpl1.greet("Sushovan");
		System.out.println(message);
	}
}

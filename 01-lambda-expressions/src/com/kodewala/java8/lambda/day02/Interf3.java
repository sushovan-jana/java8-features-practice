package com.kodewala.java8.lambda.day02;

@FunctionalInterface
public interface Interf3 {
	
	public void m1(); // this is abstract
	
	default void m2() {
		System.out.println("this is a default method");
	}
	
	static void m3() {
		System.out.println("this is static method");
	}
}
 
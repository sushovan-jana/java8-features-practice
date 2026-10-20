package com.kodewala.java8.lambda.day02;
/**
 * Here in this class we will to provide implementation for m1() method only.. 
 * We'll use lamda expression
 * Before 1.8v to provide implementation we would have to use implemented class concept
 */
public class Interf3Impl {
	
	public static void main(String[] args) {
//		this is lamda expression
		Interf3 interf = () -> System.out.println("Hello");
		interf.m1();
		interf.m2(); // this is default method...
	}
}

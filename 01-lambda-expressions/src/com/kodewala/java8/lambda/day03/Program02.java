package com.kodewala.java8.lambda.day03;
/**
 * Multiple inheritance in default method..
 * In the below class we are implementing tow interface that contains same method (default method) compulsory we've to
 * provide implementation, although it is default method
 */
public class Program02 implements Interf1, Interf2 {
	
	@Override
	public void m1() {
//		If we want we can call specific Interface's default method using -> InterfaceName.super.methodName
		Interf1.super.m1();
		Interf2.super.m1();
		System.out.println("Program02 m1() method");
	}
	
	public static void main(String[] args) {
		Program02 program02 = new Program02();
		program02.m1();
	}
	
} 

package com.kodewala.java8.lambda.day02;

public class Interf4Impl {
	public static void main(String[] args) {
//		within curly braces {} compulsory we've to take return statemetn...
		Interf4 interf4 = (int num1, int num2) -> {return num1 + num2;};
		int result = interf4.sumOfTwo(5, 20); // 25
		System.out.println(result);
		
//		OR
		Interf4 interf42 = (num1, num2) -> num1 + num2; // Compiler will understand the type of num1 & num2
		System.out.println(interf42.sumOfTwo(6, 10)); // 16
	}
}

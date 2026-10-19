package com.kodewala.java8.lambda.day01;

public class CalculatorImpl {

	public static void main(String[] args) {
		Calculator calculator = (int a, int b) -> {return a + b;};
		int result1 = calculator.sum(7,  5);
		System.out.println("First sum " + result1);
		
		Calculator calculator2 = (int a, int b) -> a + b;
		System.out.println("Second sum " + calculator2.sum(88, 21));
		
		Calculator calculator3 = (a, b) -> a + b;
		System.out.println("Third sum " + calculator3.sum(90, 80));
	}

}

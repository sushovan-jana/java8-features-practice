package com.kodewala.stream.basic.day06;
/**
 * method reference
 */
public class Program01 {
	public static void main(String[] args) {
		/*
		 * Program01 program01 = new Program01();
		 * 
		 * ISum iSum = program01::addition; System.out.println(iSum.sum(34, 20));
		 */
		
		ISum iSum = Program01::addition; // new Program01().addition(20, 12);
		int sum = iSum.sum(new Program01(), 20, 12); // arbitory object
		System.out.println(sum);
		
//		normal :: use
		/*
		 * IUpperCase case1 = new Program01()::convertInUpperCase; String
		 * upperCaseString = case1.convertStringUpperCase("sushovan jana");
		 * System.out.println(upperCaseString);
		 */
		
//		arbitory object
		IUpperCase case1 = Program01::convertInUpperCase; // it's look like static method called but it is not
		String convertStringUpperCase = case1.convertStringUpperCase(new Program01(), "i am sushovan jana");
		System.out.println(convertStringUpperCase);

	}
	
	String convertInUpperCase(String str) {
		return str.toUpperCase();
	}
	
	public int addition(int num1, int num2) {
		return num1 + num2;
	}
}

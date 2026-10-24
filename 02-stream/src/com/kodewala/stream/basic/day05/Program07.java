package com.kodewala.stream.basic.day05;
/**
 * method reference
 */
@FunctionalInterface
interface Isum {
	int sum(int value1, int value2);
}

public class Program07 {
	public static void main(String[] args) {
		System.out.println("Using anonymous inner class concept");
		Isum isum = new Isum() {
			
			@Override
			public int sum(int value1, int value2) {
				return value1 + value2;
			}
		};
		int result1 = isum.sum(20, 21);
		System.out.println(result1);

		System.out.println("Using lamda expression concept");
		Isum isum2 = (n1, n2) -> n1 + n2;
		int result2 = isum2.sum(32, 21);
		System.out.println(result2);
		
		System.out.println("Using method reference (static) ");
		Isum isum3 = Program07::addition; // reusing the existing static method in the class
		int result3 = isum3.sum(21, 90);
		System.out.println(result3);
		
		System.out.println("Using Integer class sum()");
		Isum isum4 = Integer::sum; // (a, b) -> {return Integer.sum(a, b);};
		int sum4 = isum4.sum(40, 20);
		System.out.println(sum4);
	}
	
	public static int addition(int num1, int num2) {
		return num1 + num2;
	}
}

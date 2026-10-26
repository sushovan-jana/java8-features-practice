package com.kodewala.stream.functional_interface.day06;

import java.util.function.BiFunction;

@FunctionalInterface
interface ISum {
	void sum(Program04 program04, int num1, int num2); // its a abstact method
}
public class Program04 {
	public static void main(String[] args) {
		/**
		 * we're using our own FunctionalInterface
		 */
		Program04 program04 = new Program04();
		ISum iSum = Program04::addition;
		iSum.sum(program04, 12, 32);
		
		BiFunction<Integer, Integer, Integer> biFunction = program04::addition;
		Integer apply = biFunction.apply(30, 20);
		System.out.println(apply);

	}
	
	public int addition(int value1, int value2) {
		System.out.println(value1 + value2);

		return value1 + value2;
	}
}

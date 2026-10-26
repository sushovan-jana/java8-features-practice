package com.kodewala.stream.basic.day06;

import java.util.function.BiFunction;

public class Program02 {
	public static void main(String[] args) {
		String str1 = "Hello ";
		String str2 = "World";
		String result = str1.concat(str2);
		System.out.println(result);

		BiFunction<String, String, String> biFunction = String::concat; // it is not possible as it is a non-static/instance method
		String concateResult = biFunction.apply("hey", " buddy");
		System.out.println(concateResult);

	}
	
}

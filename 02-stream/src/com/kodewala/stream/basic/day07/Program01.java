package com.kodewala.stream.basic.day07;

import java.util.function.Function;
import java.util.function.Supplier;

public class Program01 {
	public static void main(String[] args) {
		String string = "sushovan jana";
		/**
		 * we can made this string in uppercase using toUpperCase() method here
		 * we'll use method reference.
		 * toUpperCase() does not take any input but returns output
		 * we're having Supplier Interface in Java, so we can use that
		 * and toUpperCase is a instance method so we're using object reference
		 */
		Supplier<String> supplier = string::toUpperCase;
		Object object = supplier.get();
		System.out.println(object);
		/**
		 * we can use a Function here
		 * Function takes one input and returns one output
		 * also in the above example we're using normal method reference of instance method
		 * but now we're going to do arbitory object function
		 */
		Function<String, String> function = String::toUpperCase; // arbitory object --> string.toUpperCase();
		String upperCaseResult = function.apply(string);
		System.out.println(upperCaseResult);
	}
}

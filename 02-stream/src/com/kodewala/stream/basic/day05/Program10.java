package com.kodewala.stream.basic.day05;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class Program10 {
	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1, 3, 2, 7, 20, 43, 21, 1, 9);
		Consumer<List<Integer>> sortingLogic = null; // consumer consuming a list of integers
		sortingLogic = Collections :: sort;
		sortingLogic.accept(integerList);
		System.out.println(integerList);
		
		BiPredicate<String, String> checkStringEquality = Object :: equals;
		boolean resultOfStringEquality = checkStringEquality.test("sushovan", "sushovan");
		System.out.println(resultOfStringEquality);
		
		Function<Object, Integer> calculateHashCode = Objects :: hashCode;
		int hashCode = calculateHashCode.apply(new Program01());
		System.out.println(hashCode);
		
		/*
		 * Consumer<Object> consumer = Objects :: hashCode;
		 * System.out.println(consumer.accept(new Program01()));
		 */
		
		Consumer<String> printLogicConsumer = System.out::println; // System class's out variable is a static variable and it returns an object of type PrintStream
//		println() is a instance method hence we've to call via object reference
		printLogicConsumer.accept("Sushvoan");
		
		IUpperCase iUpperCase = String::toUpperCase;
		String convertStringToUpperCase = iUpperCase.convertStringToUpperCase("sushovan");
		System.out.println(convertStringToUpperCase);
	}
	
}

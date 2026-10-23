package com.kodewala.stream.intro.day04;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Program03 {
	public static void main(String[] args) {
		Integer[] numbers = {1, 2, 3, 4, 5, 6, 9, 20, 21};
		/*
		 * System.out.println("Printing numbers greater than 5"); for(Integer i :
		 * numbers) { if(i > 5) { System.out.println(i); } }
		 */
		
//		using Stream API concept
		Predicate<Integer> predicate = (i) -> i > 5;
		Consumer<Integer> consumer = (i) -> System.out.println(i);
		Stream<Integer> streamOfIntegers = Arrays.stream(numbers);
		streamOfIntegers.filter(predicate).forEach(consumer);
		
	}
}

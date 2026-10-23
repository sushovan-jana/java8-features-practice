package com.kodewala.stream.intro.day04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Transformation numbers to words
 * Stream is Lazy
 * 1. Whenever terminal operation we are activating then intermediate operations will be performed
 */
public class Program05 {
	public static void main(String[] args) {
		
		Integer[] numbers = { 1, 3, 2, 4, 7, 5, 9, 8, 10 };
		Stream<Integer> streamOfNumbers = Arrays.stream(numbers);
		Stream<Integer> streamOfFilteredNumbers = streamOfNumbers.filter(i -> i > 5);
		
		Stream<String> streamOfFilteredNumbersString = 
				streamOfFilteredNumbers
				.map(number -> {
					switch (number) {
					case 1:  return "one";
					case 2:  return "two";
					case 3:  return "three";
					case 4:  return "four";
					case 5:  return "five";
					case 6:  return "six";
					case 7:  return "seven";
					case 8:  return "eight";
					case 9:  return "nine";
					case 10: return "ten";
					default: return "invalid";
					}
				});
		long count = streamOfFilteredNumbersString.count();
		System.out.println(count);
		
		// 1. Click right here on the line below!
		// 2. Type syso and hit Ctrl + Space. It will work now because the code structure is clean.
		
	}
}


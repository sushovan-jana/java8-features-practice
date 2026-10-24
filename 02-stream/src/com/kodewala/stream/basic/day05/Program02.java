package com.kodewala.stream.basic.day05;

import java.util.stream.Stream;

public class Program02 {
	public static void main(String[] args) {
		Stream<Integer> streamOfIntegers = Stream.of(23, 34, 12, 87, 21, 23, 89, 90, 43, 2, 4, 12);
//		stateful intermediate operation 
		Stream<Integer> sortedStreamOfIntegers = streamOfIntegers.sorted();
		sortedStreamOfIntegers.forEach(i -> System.out.println(i)); // print in ascending order
		
		Stream.of("Abc", "Sushovan", "Bubun", "Rakesh", "Ravi", "Def", "Durga", "Ajay")
				.filter(str -> {
					System.out.println("Applying fileter on " + str);
					return str.length() > 3;
				})
				.sorted() // stateful intermediate operation
				.peek(filteredName -> System.out.println("sorting done for name " + filteredName))
				.forEach(str -> System.out.println(str));
	}
}

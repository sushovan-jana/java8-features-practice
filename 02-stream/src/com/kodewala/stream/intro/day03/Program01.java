package com.kodewala.stream.intro.day03;

import java.util.function.Supplier;
import java.util.stream.Stream;

// Stream Interface -> generate() method, will take Supplier object as input and returns a Stream
//					-> of() method takes input as var-arg method / arrays and returns a Stream
//					forEach() method takes Consumer as input
public class Program01 {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Supplier<String> supplier = () -> "Hello";
//		generate method will create an infinite loop of giving suppiler, internally it will call Supplier I get() again and again
		/*
		 * Stream<String> streamString = Stream.generate(supplier);
		 * streamString.forEach(s -> System.out.println(s));
		 */
		
		Stream<Integer> integersStream = Stream.of(1, 3, 2, 9, 6);
		integersStream.forEach(n -> System.out.println(n));
	}
}
 
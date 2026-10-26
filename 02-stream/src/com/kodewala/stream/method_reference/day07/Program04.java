package com.kodewala.stream.method_reference.day07;

import java.util.stream.Stream;

/**
 * takeWhile()
 */
public class Program04 {
	public static void main(String[] args) {
		Stream.of(1, 2, 3, 4, 5, 6, 8, 7, 10)
		.filter(integer -> {
			System.out.println("filter applying on " + integer);
			return integer < 8;
		})
		.map(i -> {
			System.out.println("map applying on " + i);
			return i * i;
		}) 
		.forEach(i -> System.out.println(i));
		
		System.err.println("takeWhile()");
		Stream.of(1, 2, 3, 4, 5, 6, 8, 7, 10)
//		stateful operation - short circuiting
		.takeWhile(integer -> {
			System.out.println("filter applying on " + integer);
			return integer < 8;
		})
		.map(i -> {
			System.out.println("map applying on " + i);
			return i * i;
		})
		.forEach(i -> System.out.println(i));
	}
}

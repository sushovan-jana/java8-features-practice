package com.kodewala.parallelStreamVSmulthreading.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Program02 {
	public static void main(String[] args) {
		ArrayList<Integer> listOfIntegers = new ArrayList<>();
		listOfIntegers.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		Stream<Integer> streamOfInteger = listOfIntegers.stream();

		streamOfInteger.parallel().sequential().forEach(System.out::println);
//		How to check a Stream pipeline is a parallel stream or sequential stream ?
		System.out.println(streamOfInteger.isParallel());

		ArrayList<Integer> listOfIntegers2 = new ArrayList<>();
		listOfIntegers2.addAll(List.of(1, 2, 3, 4, 5, 6, 10));
		/**
		 * NOTE : stream pipeline will either sequential or parallel.
		 * What ever we write at last (parallel() / sequential()) based on that  stream pipeline will be behved.
		 * It's not that if we write parallel() at first then it will start behaving like parallel stream....
		 */
		listOfIntegers2.stream()
				.map(i -> i + 2)
//				.peek(c -> System.out.println(" By thread : " + Thread.currentThread().getName()))
				.parallel()
//				.peek(c -> System.out.println(" By thread : " + Thread.currentThread().getName()))
				.map(i -> i * 2)
//				if we want the ordering in parallel stream , then we'll use this method
				.forEachOrdered(System.out::println);

	}
}

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
		listOfIntegers2
				.stream()
				.map(i -> i + 2)
//				.peek(c -> System.out.println(" By thread : " + Thread.currentThread().getName()))
				.parallel()
//				.peek(c -> System.out.println(" By thread : " + Thread.currentThread().getName()))
				.map(i -> i * 2)
//				if we want the ordering in parallel stream , then we'll use this method
//				we will not lose the parallel ability
//				in which way elements were processed in the pipeline in that same way
//				the elements will be processed although it's not loosin parallel ability 
				.forEachOrdered(System.out::println);
		
		System.out.println("**************************************");
		System.out.println("**************************************");
		
		ArrayList<Integer> listOfIntegers3 = new ArrayList<>();
		listOfIntegers3.addAll(List.of(10, 22, 3, 4, 50, 6, 100, 0, 3, 21, 99, 90, 3, 213, 453, 7009, 1054));
		
		listOfIntegers3.parallelStream().filter(number -> number % 2 == 0)
					.sorted((i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0)

					.forEachOrdered(System.out::println);
		

	}
}

package com.kodewala.parallelStreamVSmulthreading.day10;

import java.util.stream.LongStream;
//import java.util.stream.Stream;

/**
 * Where to use parallel stream
 */
public class Program04 {
	public static void main(String[] args) {
		long sum = LongStream
			.rangeClosed(0, 10000000)
			.sum();
		System.out.println(sum);
		
//		This executes faster than sequential stream...
		long sum1 = LongStream
				.rangeClosed(0, 10000000)
				.parallel()
				.sum();
			System.out.println(sum1);
		
	}
}

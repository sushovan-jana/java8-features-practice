package com.kodewala.stream_VS_int_stream.day09;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BinaryOperator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Program02 {
	public static void main(String[] args) {
		/**
		 * Internally, compiler is taking each primitive int value
		 * and converting into Integer (wrapper class object) 
		 * 
		 * This creates performance problem
		 */
		Stream<Integer> streamOfInteger = Stream.of(1, 2, 3, 4, 6, 8, 3);
		streamOfInteger.forEach(System.out::println);
		/**
		 * IntStream is designed to handle the primitive values
		 * 
		 * It will take less memory
		 */
		IntStream intStream = IntStream.of(23, 21, 45, 54, 67, 76);
		int sum = intStream.sum(); // terminal operation
		System.out.println(" intStream Sum " + sum);
		
		IntStream intStream2 = IntStream.of();
		OptionalInt min = intStream2.min(); // terminal operation
		/**
		 * If no element present inside IntStream then if we're trying to get
		 * minimum value, we'll get runtime exception : NoSuchElementException
		 */
//		System.out.println("Min " + min.getAsInt()); 
		/**
		 * To overcome the runtime exception we can use
		 * if - else ladder with isPresent() method
		 */
		if(min.isPresent()) {
			System.out.println(" intStream2 Min " + min.getAsInt());
		} else {
			System.out.println(" intStream2 No value present...");
		}

//		intStream.forEach(System.out::println);
		
		DoubleStream doubleStream = DoubleStream.of(10.3, 56.7, 88, 43);
		doubleStream.forEach(System.out::println);
		
		Stream<Integer> streamOfInteger2 = Stream.of(20, 30, 40, 10, 40);
		Optional<Integer> result = streamOfInteger2.reduce(new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
		});
		
		if(result.isPresent()) {
			System.out.println(" result " + result.get());

		}
		
		
	}
}

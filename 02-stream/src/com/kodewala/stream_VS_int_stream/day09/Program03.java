package com.kodewala.stream_VS_int_stream.day09;

import java.util.Optional;
import java.util.stream.Stream;
/**
 * reduce() is a terminal operation
 */
public class Program03 {
	public static void main(String[] args) {
		Stream<Integer> streamOfIntegers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		I want to use reduce() method that takes BinaryOperator as input 
		Optional<Integer> resultByreduce = streamOfIntegers.peek(number -> System.out.println(" [Peeking up number] : " + number))
				.reduce((Integer i, Integer i2) -> {
					System.out.println(" [i] -> " + i + "[ & i2] -> " + i2);
					System.out.println(" i + i2 : " + (i + i2));

					return i + i2;
				});
		System.out.println(" [Sum result using reduce-BinaryOperator] : " + resultByreduce.get());
		
//		we can also pass initial value reduce () method as well
		Stream<Integer> streamofIntegers2 = Stream.of(20, 30, 50, 10, 70, 60);
		Integer resultByreduce2 = streamofIntegers2.peek(number -> System.out.println(" [Peeking up number] : " + number))
				.reduce(0, (Integer i, Integer i2) -> {
					System.out.println(" [i] -> " + i + "[ & i2] -> " + i2);
					System.out.println(" i * i2 : " + (i * i2));

					return i * i2;
				});
		System.out.println(" [Sum result using reduce-BinaryOperator] : " + resultByreduce2);
		
		

	}
}

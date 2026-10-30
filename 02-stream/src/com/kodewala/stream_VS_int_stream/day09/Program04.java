package com.kodewala.stream_VS_int_stream.day09;

import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * can we convert Stream<Integer> to IntStream ?
 * yes, we can. Using mapToInt() method
 */
public class Program04 {
	public static void main(String[] args) {
		ToIntFunction<Integer> function = (num) -> num;
		Stream<Integer> streamOfIntegers = Stream.of(1, 2, 3, 4, 5, 6, 7);
		IntStream mapToInt = streamOfIntegers.mapToInt(function);
		int sum = mapToInt.sum();
		System.out.println(sum);

	}
}
 
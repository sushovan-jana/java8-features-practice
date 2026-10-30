package com.kodewala.stream_VS_int_stream.day09;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
/**
 * convert int type (primitive type) values to Integer type(Object type)
 */
public class Program05 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/**
		 * To create int type stream we've three methods
		 */
		IntStream intStream1 = IntStream.of(1, 2, 4, 5, 9);
		IntStream intStream2 = IntStream.range(1, 10); // gives value 1 to 9
		System.out.println("-----------------------------");
		IntStream intStream3 = IntStream.rangeClosed(1, 10); // gives value 1 to 10
		intStream2.forEach(System.out::println);
		intStream3.forEach(System.out::println);
		System.out.println();

		/**
		 * Can we call hashCode() on primitive type ?
		 * ans : No, we have convert primitive type to object type
		 * then we can call hashCode() method.
		 * using boxed() method we can do that.
		 */
		
		IntStream intStream = IntStream.rangeClosed(1, 10);
		intStream.boxed().map(integerObj -> integerObj.hashCode()).forEach(System.out::println);
		
		Integer[] array = new Integer[] {1, 2, 3, 4};
		Stream<Integer> streamOfIntegers = Arrays.stream(array);
		System.out.println(streamOfIntegers);

	}
}

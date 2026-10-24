package com.kodewala.stream.basic.day05;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Program03 {
	public static void main(String[] args) {
		
//		this is an infinite stream
		Stream<Integer> streamOfInteger = Stream.iterate(0, new UnaryOperator<Integer>() {
			public Integer apply(Integer t) {
				return t + 1;
			}
		});
		

		streamOfInteger
		.filter(integer -> integer < 20) // putting filter operation but it will behave differently it will give negative value
		.limit(20) // it is a stateful operation (intermediate)
		/**
		 * limit() is a short circuiting operation : whenever limit reaches
		 * it close the pipeline (stream)
		 */
		.forEach(integer -> System.out.println(integer));
		
//		Stream<Integer> sorted = streamOfInteger.sorted(); // IllegalStateException
	}
}

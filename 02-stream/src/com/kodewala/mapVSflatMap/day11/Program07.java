package com.kodewala.mapVSflatMap.day11;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program07 {
	public static void main(String[] args) {
		List<String> listOfStrings = List.of("Hello baby", "hello world", "Btm layout", "South Bangalore City");
		Stream<String> streamOfString = listOfStrings.stream();
		/*
		 * Stream<List<String>> streamOflistOfString = streamOfString.map(new
		 * Function<String, List<String>>() {
		 * 
		 * @Override public List<String> apply(String str) { String[] strArr =
		 * str.split(" "); List<String> outputList = Arrays.asList(strArr); return
		 * outputList; } }); List<List<String>> listOfString =
		 * streamOflistOfString.collect(Collectors.toList());
		 * System.out.println(listOfString); // [[Hello, baby], [hello, world], [Btm,
		 * layout], [South, Bangalore, City]]
		 */
//		Using flatMap
		Stream<String> finalStreamOfString = streamOfString.flatMap(new Function<String, Stream<String>>() {

			@Override
			public Stream<String> apply(String string) {
				String[] stringArr = string.split(" ");
				Stream<String> stringStream = Stream.of(stringArr);
				return stringStream;
			}
		});
		
		List<String> flattenedList = finalStreamOfString.collect(Collectors.toList());
		System.out.println(flattenedList); // [Hello, baby, hello, world, Btm, layout, South, Bangalore, City]

	}
}

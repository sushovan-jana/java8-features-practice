package com.kodewala.mapVSflatMap.day11;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program06 {
	public static void main(String[] args) {
		List<Integer> integerList = List.of(1, 2, 3, 4, 5);
		Stream<Integer> streamOfInteger = integerList.stream();

		Stream<String> streamOfString = streamOfInteger.parallel().map(new Function<Integer, String>() {

			@Override
			public String apply(Integer inputValue) {

				return "Value is : " + inputValue;
			}
		});
		List<String> listOfString = streamOfString.collect(Collectors.toList());
		System.out.println(listOfString);

	}
}

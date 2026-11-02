package com.kodewala.parallelStreamVSmulthreading.day10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program05 {
	public static void main(String[] args) {
//		ArrayList<Integer> listOfIntegers = new ArrayList<>();
		List<Integer> list = Stream
			.iterate(0, no -> no + 1)
			.limit(20)
			.parallel()
			.collect(Collectors.toList());
		
		System.out.println(list);
		System.out.println(list.size());
	}
}

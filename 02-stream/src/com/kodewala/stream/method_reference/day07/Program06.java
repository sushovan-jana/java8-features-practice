package com.kodewala.stream.method_reference.day07;

import java.util.stream.Stream;

public class Program06 {
	public static void main(String[] args) {
		/*
		 * Stream.of( "Leo", "Maya", "Lucas", "Sophia", "Jackson", "Isabella",
		 * "Alexander", "Clementine" ) .skip(3) // will skip first 3 - stateful
		 * intermediate operation .forEach(c -> System.out.println(c));
		 */
		
		Stream.of(
	            "Leo", "Maya", "Lucas", "Sophia", 
	            "Jackson", "Isabella", "Alexander", "Clementine", "Sophia", 
	            "Jackson", "Isabella"
	        )
		.distinct() // stateful operation -- gives unique elements duplicates are removed
		.forEach(c -> System.out.println(c));
	}
}

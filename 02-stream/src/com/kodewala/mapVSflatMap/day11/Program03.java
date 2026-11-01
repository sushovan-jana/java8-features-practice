package com.kodewala.mapVSflatMap.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * A practical demonstration of how 'flatMap' works behind the scenes.
 * 
 * Concept: 1. Mapping: Transforming a single element into a collection of
 * elements (1-to-Many). 2. Flattening: Merging multiple collections into a
 * single, unified list.
 */
public class Program03 {
	public static void main(String[] args) {
		// Step 1: Initialize a starting list of words
		List<String> listOfWords = List.of("sushvoan", "shovan", "bubun", "jhony", "mint");

		// Step 2: Define the transformation logic using a functional interface
		// This function takes a single String and splits it into a List of individual
		// characters (1-to-Many mapping)
		Function<String, List<String>> funStrToStrArr = new Function<>() {
			@Override
			public List<String> apply(String t) {
				String[] splitArr = t.split("");
				return Arrays.asList(splitArr);
			}
		};

		// Step 3: Execute our custom flatMap implementation
		// It processes each word, splits it into characters, and flattens the result
		// into a single list
		List<String> mergedList = flatMap(listOfWords, funStrToStrArr);

		// Step 4: Output the final flattened result
		System.out.println("Flattened List of Characters: " + mergedList);
	}

	/**
	 * Custom implementation of the flatMap operations.
	 * 
	 * @param inputList The initial list of elements to process.
	 * @param mapper    The function that defines how to transform a single element
	 *                  into a List.
	 * @return A single, flattened List containing all transformed elements.
	 */
	public static List<String> flatMap(List<String> inputList, Function<String, List<String>> mapper) {
		List<String> returnList = new ArrayList<>();

		for (String string : inputList) {
			// 1. MAPPING STAGE (1 to Many)
			// Transforms a single String into a List of its individual characters
			List<String> listOfString = mapper.apply(string);

			// 2. FLATTENING STAGE
			// Iterates through the generated sub-list and accumulates everything into one
			// master list
			for (String s : listOfString) {
				returnList.add(s);
			}
		}

		return returnList;
	}
}

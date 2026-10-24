package com.kodewala.stream.basic.day05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Program10 {
	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1, 3, 2, 7, 20, 43, 21, 1, 9);
		Consumer<List<Integer>> sortingLogic = null; // consumer consuming a list of integers
		sortingLogic.accept(integerList);
	}
}

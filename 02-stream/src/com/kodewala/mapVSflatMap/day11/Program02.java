package com.kodewala.mapVSflatMap.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
//import java.util.stream.Stream;

public class Program02 {
	public static void main(String[] args) {
		
		/**
		 * sushovan ---> 8
		 * bob ---> 3
		 */
		Function<String, Integer> funStrToInt = (str) -> str.length(); // giving a String type and getting an Integer type...
		Integer length1 = funStrToInt.apply("sushovan");
		System.out.println(length1);

		
		List<String> listOfStrings = List.of("Sushovan", "Oggy", "Katrina", "Andrew", "Iron Man", "Thor");
		/*
		 * Stream<Integer> map = listOfStrings.stream().map(((String str) ->
		 * str.length())); map.forEach(System.out::println);
		 */
		
		/**
		 * I want a list of an integer where length of strings will be stored
		 */
		List<Integer> strToInt = strToInt(listOfStrings, funStrToInt);
		System.out.println(strToInt);
 
	}
	
	/**
	 * We are giving T and getting R
	 * T --> String
	 * R --> Integer
	 * ONE TO ONE MAPPING
	 * @param <T>
	 * @param <R>
	 * @param list
	 * @param mapperFunction
	 * @return R
	 */
	public static <T, R> List<R> strToInt(List<T> list, Function<T, R> mapperFunction) {
		/**
		 * This is called one to one mapping...
		 */
		ArrayList<R> listOfInt = new ArrayList<>();
		
		for(T t : list) {
			/**
			 * mapperFunction is taking input as String and giving output as Integer
			 * that Integer I am storing in ArrayList<Integer> and returning...
			 * The ArrayList contains the length of each String... 
			 */
			R value = mapperFunction.apply(t);
			listOfInt.add(value);
		}

		return listOfInt;
			
	}
}

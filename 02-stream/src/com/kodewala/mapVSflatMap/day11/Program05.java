package com.kodewala.mapVSflatMap.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Program05 {
	public static void main(String[] args) {
		/**
		 * input : [1, 2, 3, 4]
		 * output : ["value is 1", "value is 2", "value is 3"...]
		 */
		Function<Integer, String> funIntToStr = new Function<>() {
			
			@Override
			public String apply(Integer t) {
				
				return "value is " + t;
			}
		};
		
		String apply = funIntToStr.apply(1);
		System.out.println(apply);
		
		List<Integer> listOfInt = List.of(1, 2, 3, 4, 5);
		List<String> flatMap = flatMap(listOfInt, funIntToStr);
		System.out.println(flatMap);

		
	}
	
	public static <T, R> List<R> flatMap(List<T> listOfInt, Function<T, R> mapper) {
		List<R> returnList = new ArrayList<>();
		for(T t : listOfInt) {
			R r = mapper.apply(t);
			returnList.add(r);
		}
		
		return returnList;
	}
	
}

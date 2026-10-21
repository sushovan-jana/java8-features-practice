package com.kodewala.java8.predefinedFI.day03;

import java.util.function.Predicate;

public class PredicateStringLength {
	public static void main(String[] args) {
//		This Predicate will check whether the given String length is greater than 5 or not
//		if greater than 5 then returns true otherwise returns false
		Predicate<String> p = (s) -> s.length() > 5;
		boolean result1 = p.test("Sushovan");
		System.out.println(result1);
		
		boolean result2 = p.test("Peter");
		System.out.println(result2);
	}
}

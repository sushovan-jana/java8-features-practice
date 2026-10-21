package com.kodewala.java8.predefinedFI.day03;
/**
 * Combining Predicate with and() method
 */
import java.util.function.Predicate;

public class PredicateAndExample {
	public static void main(String[] args) {
		Predicate<Integer> p1 = (i) -> i >= 10;
		Predicate<Integer> p2 = (i) -> i <= 100;
//		We'll combine two Predicate to check whether a number is greater equal to 10 and less equal to 100
		System.out.println(" Checking 76, result is " + (p1.and(p2).test(76)));
		System.out.println(" Checking 8, result is " + (p1.and(p2).test(8)));
		System.out.println(" Checking 900, result is " + p2.and(p1).test(900));
	}
}

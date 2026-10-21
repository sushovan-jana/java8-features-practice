package com.kodewala.java8.predefinedFI.day03;

import java.util.function.Predicate;

/**
 * Using or() method in Predicate
 */
public class PredicateOrExample {
	public static void main(String[] args) {
//		This Predicate will check whether the given integer is divisible by 3 or not
		Predicate<Integer> p1 = (i) -> i % 3 == 0;
//		This Predicate will check whether the given integer is divisible by 5 or not
		Predicate<Integer> p2 = (i) -> i % 5 == 0;
		System.out.println(" Checking for 34, result is  " + (p1.or(p2).test(34)));
		System.out.println(" Checking for 15, result is  " + (p1.or(p2).test(15)));
	}
}

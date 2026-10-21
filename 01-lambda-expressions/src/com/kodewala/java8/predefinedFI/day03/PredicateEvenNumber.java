package com.kodewala.java8.predefinedFI.day03;

import java.util.function.Predicate;

public class PredicateEvenNumber {
	public static void main(String[] args) {
//		Takes one input and performs some condition checking and return boolean values
//		Predicate FI contains one abstract method i.e -> public boolean test(T t)
		Predicate<Integer> p = (i) -> i % 2 == 0;
		boolean firstResult = p.test(20);
		boolean secondResult = p.test(3);
		System.out.println("First result " + firstResult);
		System.out.println("Second result " + secondResult);
	}
}

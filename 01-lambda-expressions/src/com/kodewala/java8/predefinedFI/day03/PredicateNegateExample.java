package com.kodewala.java8.predefinedFI.day03;

import java.util.function.Predicate;
/**
 * Using negate() method, understanding how it works...
 */
public class PredicateNegateExample {
	public static void main(String[] args) {
		int[] arr = {2, 4, 12, 43, 56, 71, 21, 20, 0};
		Predicate<Integer> p = (i) -> i % 2 == 0;
		System.out.println(" Printing even numbers from the array : ");
		for (int e : arr) {
			if (p.test(e)) {
				System.out.println(" " + e);
			}
		}
		
		System.out.println(" Printing the odd numbers from the array : ");
		for (int e : arr) {
			if (p.negate().test(e)) {
				System.out.println(e);
			}
		}
	}
}

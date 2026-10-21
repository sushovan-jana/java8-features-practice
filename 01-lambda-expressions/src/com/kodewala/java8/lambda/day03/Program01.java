package com.kodewala.java8.lambda.day03;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Program01 {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(12);
		l.add(54);
		l.add(87);
		l.add(21);
		l.add(76);
		System.out.println(l); // It will be printed based on insertion order
		
//		Requirement : have to sort based on natural sorting order
//		Collections.sort(l, new MyComparator()); // passing the targeted list and compartor object
		System.out.println(l);
//		PROBLEM : We're using a different class that implements Comparator
//		Comparator contains only one method that is : compare() method
//		Hence it's a FunctionalInterface, we can use here lamda expression
//		In this code we're providing default natural sorting logic but the code is less (concise code)
		Comparator<Integer> c = (i1, i2) -> {
			return (i1 > i2) ? 1 : (i1 < i2) ? -1 : 0;
		};
		Collections.sort(l, c);
		System.out.println(l);
	}
}

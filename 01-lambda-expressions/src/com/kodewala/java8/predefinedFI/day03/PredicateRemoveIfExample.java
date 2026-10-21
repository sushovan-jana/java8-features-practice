package com.kodewala.java8.predefinedFI.day03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateRemoveIfExample {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
        names.add("Amit");
        names.add("Sushovan");
        names.add("Rahul");
        names.add("Priyansh");

        Predicate<String> p = name -> name.length() < 5;

        names.removeIf(p);

        System.out.println(names);
		
	}
}

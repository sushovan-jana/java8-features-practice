package com.kodewala.stream.basic.day05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Intermediate operations are lazy
 */
public class Program01 {
	public static void main(String[] args) {
		
		List<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Sushovan");
		listOfNames.add("Priyanka");
		listOfNames.add("Aniruddh");
		listOfNames.add("Amit");
		listOfNames.add("Riya");
		listOfNames.add("Dev");
		listOfNames.add("Aman");
		listOfNames.add("Deepika");
		listOfNames.add("Vikram");
		
		Stream<String> streamOfNames = listOfNames.stream();
		Stream<String> filteredNames = streamOfNames.filter(str -> {
			System.out.println("Performing filteration on " + str);
			return str.length() > 5;
		});
//		if we comment this line (terminal operation) then filteration will not be done
		filteredNames.forEach(c -> System.out.println(c));
		
	}
}

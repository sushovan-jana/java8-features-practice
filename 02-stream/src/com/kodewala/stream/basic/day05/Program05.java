package com.kodewala.stream.basic.day05;

import java.util.stream.Stream;

public class Program05 {
	public static void main(String[] args) {
		/*
		 * Stream.of("sushovan", "soumya", "avi", "raju", "nandan", "biswa")
		 * .takeWhile(name -> { System.out.println("takeWhile() called on " + name);
		 * return !name.equals("avi"); // whenever control reaches to avi then it gets
		 * shor circuit and close the Stream pipeline }) .forEach(name ->
		 * System.out.println(name));
		 */
		
		Stream.of("sushovan", "soumya", "avi", "raju", "nandan", "biswa")
		.takeWhile(name -> {
			System.out.println("takeWhile() called on " + name);
			return name.length() > 3; // whenever control reaches to this condition then it gets shor circuit and close the Stream pipeline
		})
		.forEach(name -> System.out.println(name));
	}
}

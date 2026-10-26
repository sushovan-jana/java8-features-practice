package com.kodewala.stream.basic.day06;

import java.util.function.Function;

public class Program03 {
	public static void main(String[] args) {
//		convert String into upper-case using :: ref
		String string = "hello, i am sushovan jana";
		Function<String, String> function = String::toUpperCase; // "hello, i am sushovan jana".toUpperCase(); 
		String upperCaseString = function.apply(string);
		System.out.println(upperCaseString);
		
	}
}

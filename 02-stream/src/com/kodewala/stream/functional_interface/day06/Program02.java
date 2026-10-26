package com.kodewala.stream.functional_interface.day06;

import java.io.PrintStream;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Program02 {
	public static void main(String[] args) {
		/**
		 * Want to create System.out.println() using method reference
		 */
		System.out.println("hey, buddy");
		/**
		 * println() is a instance method
		 * it takes a parameter
		 * in java we're having Consumer Functional Interface that takes one parameter
		 */
		Consumer<String> consumer = System.out::println; // static way of calling println() method
		consumer.accept("hello");
		/**
		 * We can use BiConsumer to use println() in an instance way
		 */
		BiConsumer<PrintStream, String> biConsumer = PrintStream::println;
		biConsumer.accept(new PrintStream(System.out), "hello bro");
	}
}

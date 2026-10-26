package com.kodewala.stream.functional_interface.day06;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Program03 {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(20);
		/**
		 * add() metho of ArrayList is a instance method
		 * return type is boolean
		 * in java we've BiPredicate FI that takes two input
		 * and returns boolean
		 */
		BiPredicate<ArrayList<Integer>, Integer> biPredicate = ArrayList::add;
		boolean added = biPredicate.test(arrayList, 66);
		System.out.println(added);
		
		/**
		 * also we can use BiConsumer
		 * that takes two input as argument but returns nothing
		 */
		BiConsumer<ArrayList<Integer>, Integer> biConsumer = ArrayList::add;
		biConsumer.accept(arrayList, 5);
		System.out.println(arrayList);
		/**
		 * also we can use BiFunction
		 * that takes two input and returns one output
		 */
		BiFunction<ArrayList<Integer>, Integer, Boolean> biFunction = ArrayList::add;
		Boolean isAdded = biFunction.apply(arrayList, 543);
		System.out.println(isAdded);
		
		System.out.println(arrayList);

	}
}
  
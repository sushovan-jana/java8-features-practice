package com.kodewala.parallelStreamVSmulthreading.day10;

import java.util.ArrayList;
/*import java.util.Collections;
import java.util.List;*/
import java.util.stream.Stream;

public class Program03 {
	public static void main(String[] args) {
		ArrayList<Integer> listOfIntegers = new ArrayList<>();
//		List<Integer> synchronizedList = Collections.synchronizedList(listOfIntegers);
		
//		ArrayList is not made for prallel situation / multiple threads, we can use CopyOnWriteArrayList / Vector
		for(int i = 0; i <= 5; i++) {
			listOfIntegers.clear(); // will clear the old elements...
			Stream
				.iterate(1, no -> no <= 20 ,no -> no + 1)
				.parallel()
				.forEachOrdered(no -> listOfIntegers.add(no));
			System.out.println(" SIZE : " + listOfIntegers.size());
			System.out.println(" ELEMENTS : " + listOfIntegers);


		}
		
//		System.out.println(listOfIntegers);

		
		/*
		 * Stream .iterate(0, no -> no <= 10, no -> no + 1)
		 * .forEach(System.out::println);
		 */


	}
} 

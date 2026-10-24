package com.kodewala.stream.basic.day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program08 {
	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(10);
		integerList.add(21);
		integerList.add(15);
		integerList.add(54);
		integerList.add(3);
		integerList.add(19);
		integerList.add(1);
		System.out.println("Printing unsorted list " + integerList);
		
		ISort iSort1 = Collections::sort; // using method reference
		iSort1.sortAList(integerList);
		System.out.println("Printing sorted list " + integerList);
	}
}

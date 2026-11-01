package com.kodewala.mapVSflatMap.day11;

import java.util.ArrayList;
import java.util.List;

public class Program01 {
	public static void main(String[] args) {
		List<Integer> listOfIntegers1 = List.of(1, 2, 3, 4, 5);
		List<Integer> listOfIntegers2 = List.of(6, 7, 8);
		List<Integer> listOfIntegers3 = List.of(9, 10, 11, 12);
		
		ArrayList<List<Integer>> list = new ArrayList<>();
		list.add(listOfIntegers1);
		list.add(listOfIntegers2);
		list.add(listOfIntegers3);
		
		/**
		 * The list which contains another lists is considered
		 * as nested list
		 */
		System.out.println(" Before merging : " + list); // [[1, 2, 3, 4, 5], [6, 7, 8], [9, 10, 11, 12]]

//		System.out.println(list.get(0));
		
		List<Integer> flatList = flatList(list);
		System.out.println(" After merging : " + flatList);

		
	}
	
	/**
	 * This method is responsible for returning one big List<Integer>
	 * @param nestedList
	 * @return List<Integer>
	 */
	public static List<Integer> flatList(ArrayList<List<Integer>> nestedList) {
		/**
		 * Want to take all the inner list / nested lists inside a 
		 * one big outer list...
		 * In plain java -> we call it flattening
		 */
		List<Integer> mergedList = new ArrayList<>();
		for(List<Integer> li : nestedList) {
			for(Integer integer : li) {
				mergedList.add(integer);
			}
		}
		
		System.out.println(" Merging has been done...");
		return mergedList;

		
	}
	
	
}

package com.kodewala.mapVSflatMap.day11;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program08 {
	public static void main(String[] args) {
		List<Employee> employeeList = List.of(
	            new Employee("Amit Sharma", List.of("9876543210", "8765432109")),
	            new Employee("Priyansh Patel", List.of("7654321098")),
	            new Employee("Rahul Verma", List.of("6543210987", "5432109876", "4321098765")),
	            new Employee("Sneha Reddy", List.of()), // Employee with no phone number
	            new Employee("Vikram Singh", List.of("3210987654"))
	        );
		
		Stream<Employee> streamOfEmployee = employeeList.stream();
		Stream<List<String>> listOfStringOfPhoneNum = streamOfEmployee.map(new Function<Employee, List<String>>() {

			@Override
			public List<String> apply(Employee emp) {
				List<String> listOfPhoneNumber = emp.getListOfPhoneNumber();
				
				return listOfPhoneNumber;
			}
		});/*.collect(Collectors.toList());
		System.out.println(listOfString); // [[9876543210, 8765432109], [7654321098], [6543210987, 5432109876, 4321098765], [], [3210987654]]
*/
		Stream<String> flattenedMap = listOfStringOfPhoneNum.flatMap((list) -> {
			return list.stream();
		});
		List<String> flattenedListOfString = flattenedMap.collect(Collectors.toList());
		System.out.println(flattenedListOfString); // [9876543210, 8765432109, 7654321098, 6543210987, 5432109876, 4321098765, 3210987654]


	}
}

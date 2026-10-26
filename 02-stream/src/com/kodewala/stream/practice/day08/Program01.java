package com.kodewala.stream.practice.day08;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.stream.Stream;
import com.kodewala.stream.constructor_reference.day08.Employee;

/**
 * Practice program demonstrating three Java 8 features together:
 * 1. Consumer with a lambda and with a method reference (System.out::println)
 * 2. Function with a lambda and with a constructor reference (Employee::new)
 * 3. A stream pipeline that converts names into Employee objects
 *
 * @author  Sushovan
 * @version 1.0
 * @since   2026-10-26
 * @see     com.kodewala.stream.constructor_reference.day08.Employee
 */
public class Program01 {
	public static void main(String[] args) {

		// Immutable list of names with mixed lengths (List.of does not allow null)
		List<String> stringList = List.of("Venkatesh", "Al", "Priyansh", "Balasubramanian", "Ravi", "Chandrakant",
				"Anjali", "Kiran", "Lakshmipriya", "Suresh", "Amitabh", "Rajesh", "Deepika");

		/**
		 * Requirement: print each element present in the list.
		 * forEach() accepts a Consumer<String>, which takes one input and returns nothing.
		 */
		System.err.println("---------------CONSUMER-----------------");
		// Lambda version: the Consumer is written inline as name -> System.out.println(name)
		stringList.forEach(name -> System.out.println(name));

		/**
		 * The lambda only passes its argument straight to println, so it can be
		 * shortened to a bound method reference. System.out is a fixed object
		 * and each list element is passed as the argument to println.
		 */
		System.err.println("---------------METHOD REF-----------------");
		stringList.forEach(System.out::println);

		/**
		 * Requirement: accept a String name and convert it into an Employee object.
		 * Function<String, Employee> takes a String and returns an Employee.
		 */
		// Lambda version: calls the Employee(String name) constructor explicitly
		Function<String, Employee> empCreationFunction = (name) -> new Employee(name);
		Employee employee1 = empCreationFunction.apply("Priyansh");
		System.out.println(employee1);

		/**
		 * Same requirement using a constructor reference. Employee::new is
		 * resolved to the Employee(String) constructor because the Function
		 * input type is String.
		 */
		System.err.println("---------------CONSTRUCTOR REF-----------------");
		Function<String, Employee> empCreationFunction2 = Employee::new;
		Employee employee2 = empCreationFunction2.apply("sushovan");
		System.out.println(employee2);

		/**
		 * Requirement: convert every name in the list into an Employee and
		 * assign each one a random id between 1 and 29.
		 */
		System.err.println("---------------STREAM & METHOD REF-----------------");

		Stream<Employee> streamOfEmployeeObject = stringList.stream()
				// Step 1: String -> Employee, reusing the constructor-reference Function
				.map(empCreationFunction2)
				// Step 2: set a random id (upper bound 30 is exclusive) and pass the same object on
				.map(employee -> {
					employee.setId(ThreadLocalRandom.current().nextInt(1, 30));
					return employee;
				});

		// Streams are lazy: nothing above runs until this terminal operation (forEach) is called.
		// System.out::println prints each Employee using its toString() method.
		streamOfEmployeeObject.forEach(System.out::println);
	}
}
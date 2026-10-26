package com.kodewala.stream.constructor_reference.day08;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Program01 {
	public static void main(String[] args) {
		/**
		 * here we are using lamda expression
		 */
		Supplier<Employee> supplier = () -> new Employee(101, "Sushovan");
		Employee employee = supplier.get();
		System.out.println(employee);
		
		/**
		 * using constructor reference
		 * here no-arg constructor will be invoked 
		 */
		Supplier<Employee> supplier2 = Employee::new;
		Employee employee2 = supplier2.get();
		System.out.println(employee2);
		
		/**
		 * now want to call the constructor that take one input as arg
		 * Function FI takes one argument and gives one object/suply one object
		 */
		Function<Integer, Employee> function = Employee::new;
		Employee employee3 = function.apply(10);
		System.out.println(employee3);
		/**
		 * we can also use BiFunction that takes two input
		 * returns one output 
		 * in this case two arg constructor will be invoked
		 */
		BiFunction<Integer, String, Employee> biFunction = Employee::new;
		Employee employee4 = biFunction.apply(322, "Bubun");
		System.out.println(employee4);
	}
}

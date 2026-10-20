package com.kodewala.java8.lambda.day02;
/**
 * It's a functional interface : An interface that contains only one abstract method is considered as FunctionalInterface
 * From 1.8v onwards default methods and static methods are allowed in interface
 * From 1.9v onwards private methods are  also allowed in interface
 */
@FunctionalInterface	// it's optional introduced in 1.8v
public interface Interf1 {
//	abstract method
	public void m1();
	default void m2() {
		System.out.println("default method inside Interf1");
	}
	static void m3() {
		System.out.println("static method inside Interf1");
	}
}


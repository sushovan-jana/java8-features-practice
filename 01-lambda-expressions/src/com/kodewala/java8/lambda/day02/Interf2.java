package com.kodewala.java8.lambda.day02;
/**
 * Methods present inside Interf1 available to the Interf2 but static methods are not available
 * We can also override default method that is we can make default methods as abstract method in child interface
 */
public interface Interf2 extends Interf1 {
	@Override
	public void m1(); 
	
//	@Override 
//	public abstract void m2(); // it's also allowed
	
//	@Override
//	public void m2(); // it's also allowed -> it's internally public abstract void m2()..
}

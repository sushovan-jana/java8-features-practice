package com.kodewala.java8.lambda.day02;

public class Interf2Impl implements Interf2 {
	
	@Override
	public void m1() {
		System.out.println("m1 overriden in implementation class...");
	}
	
	public static void main(String[] args) {
		
		Interf2 interf2 = new Interf2Impl();
//		Interf2.m3(); // this method is undefined
		interf2.m1(); // this method will be called from the implementation class i.e Interf2Impl
		interf2.m2();
		Interf1.m3(); // as it's static method so calling using Interface name...
	}
}

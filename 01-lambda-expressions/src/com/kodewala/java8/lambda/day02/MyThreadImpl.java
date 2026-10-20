package com.kodewala.java8.lambda.day02;
/**
 * This class is the example of how lamda expression works in multi-threading concept
 * We'll get mixed outpt as we can't predict the output
 * NOTE : NO CLASS FILE WILL GENERATED FOR LAMDA EXPRESSION
 */
public class MyThreadImpl {
	public static void main(String[] args) {
//		Runnable is interface that contains only one method i.e run(), hence it's a functional interface
		Runnable r = () -> {
//			child thread job
			for (int i = 0; i < 10; i++) {
				System.out.println("child thread");
			}
		};
//		r is targated thread
		Thread thread = new Thread(r);
		thread.start(); // after this line executes two threads wll be there -> child thread and main thread
		
//		main thread job
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}
}

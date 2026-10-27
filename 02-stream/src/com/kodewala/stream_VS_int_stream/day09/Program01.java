package com.kodewala.stream_VS_int_stream.day09;

import java.util.ArrayList;

/**
 * Discussing about Boxing VS Auto boxing VS Auto unboxing
 * 
 * @author Sushovan Jana 
 */
public class Program01 {
	public static void main(String[] args) {
		int i = 10; // primitive value
		/**
		 * This process is called boxing
		 * as we're doing manually
		 */
		Integer integerOfi = Integer.valueOf(i);
		System.out.println(integerOfi);
		
		/**
		 * Compiler has done boxing calling Integer.valueOf() method
		 * internally
		 * This process is called Auto boxing
		 */
		Integer integerOfi2 = i;
		System.out.println(integerOfi2);
		
		/**
		 * Compiler is doing boxing internally
		 * 
		 * The arrayList object takes Integer types
		 * 
		 * We're providing primitive value
		 * But, internally the primitive value is getting converted into
		 * corresponding Wrapper class object
		 */
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1); // Internally : arrayList.add(Integer.valueOf(1));
		arrayList.add(10);
		arrayList.add(100);
		arrayList.add(1000);
		
		Integer integer0 = arrayList.get(0);
		System.out.println(integer0);

		/**
		 * In this case arrayList object i.e Integer is getting converted to
		 * primitive type. This concept is called Auto-unboxing
		 * as, this convertion is happening by compiler automatically
		 */
		int integer1 = arrayList.get(1); 
		System.out.println(integer1);

	}
}

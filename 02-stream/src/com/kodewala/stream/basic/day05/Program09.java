package com.kodewala.stream.basic.day05;

public class Program09 {
	public static void main(String[] args) {
		IPrint iPrint1 = (str) -> System.out.println(str);
		iPrint1.printString("Sushovan");
		
		Program09 program09 = new Program09();
		
		IPrint iPrint2 = program09::printString; // return type not creating any problem ?
//		we've to check just the argument of the interface ? 
		/*
		 * not at all, if the interface method return type is void then we can take another
		 * return type in method reference
		 */
		iPrint2.printString("BUBUN");
		
	}
	
	public String printString(String name) {
		System.out.println("Printing ---");
		System.out.println(name);
		return name;
	}
}

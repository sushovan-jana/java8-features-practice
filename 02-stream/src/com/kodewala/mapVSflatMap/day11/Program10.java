package com.kodewala.mapVSflatMap.day11;

import java.util.List;

public class Program10 {
	public static void main(String[] args) {
		Person person1 = new Person("Aarav Mehta", (byte) 28, List.of("9876543210", "9123456789"), List.of("Avi", "Aru"));
        Person person2 = new Person("Diya Sharma", (byte) 24, List.of("9988776655"), List.of("Dee", "Choti"));
        Person person3 = new Person("Rohan Das", (byte) 32, List.of("9445566778", "9332211001"), List.of("Ro", "Rocky", "Rahul"));
        Person person4 = new Person("Isha Patel", (byte) 19, List.of(), List.of("Ish")); // Edge case: No phone numbers
        Person person5 = new Person("Kabir Singh", (byte) 45, List.of("9556677889", "8569746285", "3589674856"), List.of()); // Edge case: No nicknames
        
	}
}

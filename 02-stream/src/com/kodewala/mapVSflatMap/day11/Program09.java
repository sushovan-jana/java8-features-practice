package com.kodewala.mapVSflatMap.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Program09 demonstrates data transformation using Java Streams.
 * The primary objective is to process a collection of Person objects 
 * and extract the count of nicknames associated with each person.
 */
public class Program09 {
	public static void main(String[] args) {
		// Initialize sample Person datasets with varied phone numbers and nicknames
		Person person1 = new Person("Aarav Mehta", (byte) 28, List.of("9876543210", "9123456789"), List.of("Avi", "Aru"));
        Person person2 = new Person("Diya Sharma", (byte) 24, List.of("9988776655"), List.of("Dee", "Choti"));
        Person person3 = new Person("Rohan Das", (byte) 32, List.of("9445566778", "9332211001"), List.of("Ro", "Rocky", "Rahul"));
        Person person4 = new Person("Isha Patel", (byte) 19, List.of(), List.of("Ish")); // Edge case: No phone numbers
        Person person5 = new Person("Kabir Singh", (byte) 45, List.of("9556677889", "8569746285", "3589674856"), List.of()); // Edge case: No nicknames
        
        // Populate the primary data source list
        List<Person> listOfPersons = new ArrayList<>();
        listOfPersons.add(person1);
        listOfPersons.add(person2);
        listOfPersons.add(person3);
        listOfPersons.add(person4);
        listOfPersons.add(person5);
        
        /**
         		 * Stream Pipeline:
         		 * 1. Convert the List<Person> into a Stream<Person>.
         		 * 2. Use flatMap to transform each Person object into a stream representing their nickname counts.
         		 */
        Stream<Integer> flattenedStream = listOfPersons.stream().flatMap((person) -> {
        	List<Integer> nickNameCountList = new ArrayList<>();
        	List<String> nickNameList = person.getNickName();
        	
        	// Extract the size of the nickname collection
        	int size = nickNameList.size();
        	nickNameCountList.add(size);
        	
        	// Return a Stream of the counts to be flattened by the pipeline
        	return nickNameCountList.stream();
        });
        
        // Terminal operation: Collect the flattened stream elements back into a sequential List
        List<Integer> flattenedList = flattenedStream.collect(Collectors.toList());
        
        // Output the final collection of nickname counts to the console
        System.out.println(flattenedList);

	}
}

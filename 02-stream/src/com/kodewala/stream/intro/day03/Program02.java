package com.kodewala.stream.intro.day03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program02 {
	public static void main(String[] args) {
		
		Student s1 = new Student(101, "Aarav Mehta", "9876543210", 20);
		Student s2 = new Student(102, "Ananya Rao", "8765432109", 22);
		Student s3 = new Student(103, "Vihaan Sharma", "7654321098", 21);
		Student s4 = new Student(104, "Diya Patel", "6543210987", 19);
		Student s5 = new Student(105, "Sai Kumar", "9123456789", 23);
		Student s6 = new Student(106, "Isha Verma", "8234567890", 21);
		Student s7 = new Student(107, "Arjun Nair", "7345678901", 20);
		Student s8 = new Student(108, "Kavya Singh", "6456789012", 22);
		
//		It's a data source
		List<Student> studentList = Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8); // asList() returns a List object
//		List Interface contains a method name stream() that returns a Stream
		Stream<Student> streamOfStudents = studentList.stream();
		streamOfStudents.forEach(student -> System.out.println(student));
	}
}

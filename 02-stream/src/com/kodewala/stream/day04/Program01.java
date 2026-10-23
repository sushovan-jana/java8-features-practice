package com.kodewala.stream.day04;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * List out first two students whose age is greater than 25
 */
public class Program01 {
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Rahul Kumar", "9876543210", 28);
		Student s2 = new Student(2, "Priya Sharma", "8765432109", 26);
		Student s3 = new Student(3, "Amit Singh", "7654321098", 31);
		Student s4 = new Student(4, "Sneha Patel", "6543210987", 29);
		Student s5 = new Student(5, "Vikram Malhotra", "5432109876", 22);
		Student s6 = new Student(6, "Ananya Das", "4321098765", 24);
		Student s7 = new Student(7, "Rohan Verma", "3210987654", 25);
		Student s8 = new Student(8, "Kiran Reddy", "2109876543", 21);
		
		ArrayList<Student> studentsList = new ArrayList<Student>();
		studentsList.add(s1);
		studentsList.add(s2);
		studentsList.add(s3);
		studentsList.add(s4);
		studentsList.add(s5);
		studentsList.add(s6);
		studentsList.add(s7);
		studentsList.add(s8);
		 
//		setting up line (Stream)
		Stream<Student> streamOfStudents = studentsList.stream();
//		have to filter those students whose age > 25
		Stream<Student> filteredStudentStream = streamOfStudents.filter(s -> s.getAge() > 25);
//		have to print first tw2 students whose age > 25
		Stream<Student> finalFilteredStream = filteredStudentStream.limit(2);
		finalFilteredStream.forEach(s -> System.out.println(s.getName() + " -- " + s.getAge()));
	}

}

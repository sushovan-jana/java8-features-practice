package com.kodewala.parallelStreamVSmulthreading.day10;

import java.util.ArrayList;
import java.util.List;

import com.kodewala.stream.functional_interface.day05.Student;

/**
 * Understanding about ParalleleStream concept using parallel() method we can
 * privide the Stream to be operated with multiple threads
 */
public class Program01 {
	public static void main(String[] args) {
		/*
		 * Stream<Integer> parallelStreamOfIntegers = Stream.of(1, 2, 3, 4, 5,
		 * 6).parallel(); parallelStreamOfIntegers.forEach(no ->
		 * System.out.println(no));
		 */

		System.out.println(" available cores : " + Runtime.getRuntime().availableProcessors());

		/**
		 * Only one core is doing this task of processing data let's see how much time
		 * its taking...
		 */
		/*
		 * long startTime = System.currentTimeMillis(); List<Student> studentList =
		 * getStudentList(); studentList.stream().filter(student -> {
		 * System.out.println(" Filter: applying on student -> " + student.getName() +
		 * ", processed by thread : " + Thread.currentThread().getName()); return
		 * student.getAge() > 25; }).map(student -> {
		 * System.out.println(" Map : applying on student -> " + student.getName() +
		 * ", processed by thread : " + Thread.currentThread().getName()); return
		 * student.getName(); }).forEach(studentName -> {
		 * System.out.println(" For - Each : applying on student -> " + studentName +
		 * ", processed by thread : " + Thread.currentThread().getName()); }); long
		 * endTime = System.currentTimeMillis();
		 * System.out.println(" Time taken by sequential stream is : " + (endTime -
		 * startTime));
		 * System.out.println("**********************************************");
		 */

		/*
		 * List<Student> studentList = getStudentList();
		 * studentList.stream().filter(student -> {
		 * System.out.println(" Filter: applying on student -> " + student.getName() +
		 * ", processed by thread : " + Thread.currentThread().getName()); return
		 * student.getAge() > 25;}) .map(student -> {
		 * System.out.println(" Map : applying on student -> " + student.getName() +
		 * ", processed by thread : " + Thread.currentThread().getName()); return
		 * student.getName(); }) .forEach(studentName -> {
		 * System.out.println(" For - Each : applying on student -> " + studentName +
		 * ", processed by thread : " + Thread.currentThread().getName()); });
		 */

		long startTime = System.currentTimeMillis();
		List<Student> studentList = getStudentList();
		studentList.stream().parallel().filter(student -> {
			System.out.println(" Filter: applying on student -> " + student.getName() + ", processed by thread : "
					+ Thread.currentThread().getName());
			return student.getAge() > 25;
		}).map(student -> {
			System.out.println(" Map : applying on student -> " + student.getName() + ", processed by thread : "
					+ Thread.currentThread().getName());
			return student.getName();
		}).forEach(studentName -> {
			System.out.println(" For - Each : applying on student -> " + studentName + ", processed by thread : "
					+ Thread.currentThread().getName());
		});
		long endTime = System.currentTimeMillis();
		System.out.println(" Time taken by parallel stream is : " + (endTime - startTime));
		System.out.println("**********************************************");

	}

	public static List<Student> getStudentList() {
		ArrayList<Student> studentList = new ArrayList<Student>();

		Student student1 = new Student(101, "Aarav", "9876543210", 22);
		Student student2 = new Student(102, "Ananya", "8765432109", 26); // Age > 25
		Student student3 = new Student(103, "Rohan", "7654321098", 21);
		Student student4 = new Student(104, "Diya", "6543210987", 28); // Age > 25
		Student student5 = new Student(105, "Kabir", "9123456789", 24);
		Student student6 = new Student(106, "Isha", "8234567890", 27); // Age > 25
		Student student7 = new Student(107, "Vikram", "7345678901", 23);
		Student student8 = new Student(108, "Meera", "6456789012", 30); // Age > 2
		Student student9 = new Student(109, "Rahul", "9567890123", 29); // Age > 25
		Student student10 = new Student(110, "Sneha", "8678901234", 20);
		Student student11 = new Student(111, "Amit", "7789012345", 31); // Age > 25
		Student student12 = new Student(112, "Pooja", "6890123456", 25);
		Student student13 = new Student(113, "Devansh", "9901234567", 27); // Age > 25

		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		studentList.add(student6);
		studentList.add(student7);
		studentList.add(student8);
		studentList.add(student9);
		studentList.add(student10);
		studentList.add(student11);
		studentList.add(student12);
		studentList.add(student13);

		return studentList;

	}
}

package com.kodewala.mapVSflatMap.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Student {
	private String studentName;
	private List<Integer> phoneNumber;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<Integer> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<Integer> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Student(String studentName, List<Integer> phoneNumber) {
		super();
		this.studentName = studentName;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", phoneNumber=" + phoneNumber + "]";
	}
	
}

public class Program04 {
	public static void main(String[] args) {

		List<Integer> phoneList1 = List.of(987654321, 912345678);
		// FIX 1: Changed reference type from Employee to Student
		Student student1 = new Student("Sushovan", phoneList1);

		List<Integer> phoneList2 = List.of(998877665);
		Student student2 = new Student("Shovan", phoneList2);

		List<Integer> phoneList3 = List.of(944556677, 933221100, 919263177);
		Student student3 = new Student("Amit", phoneList3);

		List<Integer> phoneList4 = List.of(911223344);
		Student student4 = new Student("Rahul", phoneList4);

		List<Integer> phoneList5 = List.of(955667788);
		Student student5 = new Student("Priyansh", phoneList5);

		List<Integer> phoneList6 = List.of(977889900, 966554433, 759789834, 983254785);
		Student student6 = new Student("Sneha", phoneList6);

		List<Integer> phoneList7 = List.of(922334455);
		Student student7 = new Student("Ankit", phoneList7);

		List<Integer> phoneList8 = List.of(988112233);
		Student student8 = new Student("Bubun", phoneList8);
		
		// FIX 2: Changed list generic type from Employee to Student
		List<Student> studentList = new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		studentList.add(student6);
		studentList.add(student7);
		studentList.add(student8);
		System.out.println(studentList);

		// FIX 3: Changed Function input parameter from Employee to Student
		Function<Student, List<Integer>> funStuToListOfInt = new Function<>() {
			
			@Override
			public List<Integer> apply(Student student) {
				List<Integer> phoneNumber = student.getPhoneNumber();
				return phoneNumber;
			}
		};
		
		List<Integer> phoneNumListOfEachStudent = flatMap(studentList, funStuToListOfInt);
		System.out.println(phoneNumListOfEachStudent);

	}
	
	/**
	 * Reuse the method -> it's a generic method....
	 * @param <T>
	 * @param <R>
	 * @param T
	 * @param mapper
	 * @return R
	 */
	public static <T, R> List<R> flatMap(List<T> T, Function<T, List<R>> mapper) {
		List<R> returnList = new ArrayList<>();
		for(T t1 : T) {
			List<R> r = mapper.apply(t1); // conversion : student -> List<Integer> : 1 to M
			for(R t : r) {
				returnList.add(t);
			}
		}
		
		return returnList;
	}

}

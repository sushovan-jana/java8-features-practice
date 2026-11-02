package com.kodewala.mapVSflatMap.day11;

import java.util.List;

public class Employee {
	private String empName;
	private List<String> listOfPhoneNumber;

	public Employee(String empName, List<String> listOfPhoneNumber) {
		super();
		this.empName = empName;
		this.listOfPhoneNumber = listOfPhoneNumber;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<String> getListOfPhoneNumber() {
		return listOfPhoneNumber;
	}

	public void setListOfPhoneNumber(List<String> listOfPhoneNumber) {
		this.listOfPhoneNumber = listOfPhoneNumber;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", listOfPhoneNumber=" + listOfPhoneNumber + "]";
	}

}

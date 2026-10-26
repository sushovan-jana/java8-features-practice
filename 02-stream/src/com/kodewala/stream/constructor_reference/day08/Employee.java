package com.kodewala.stream.constructor_reference.day08;

public class Employee {
	private int id;
	private String name;
	
	public Employee() {
		
	}

	public Employee(int id) {
		super();
		this.id = id;
	}
	

	public Employee(String name) {
		super();
		this.name = name;
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public double getId() {
		return id;
	}

	public void setId(int d) {
		this.id = d;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}

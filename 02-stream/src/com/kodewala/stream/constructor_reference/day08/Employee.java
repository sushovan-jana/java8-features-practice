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

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

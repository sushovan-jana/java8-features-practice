package com.kodewala.mapVSflatMap.day11;

import java.util.List;

public class Person {
	private String name;
	private byte age;
	private List<String> phoneNumber;
	private List<String> nickName;

	public Person(String name, byte age, List<String> phoneNumber, List<String> nickName) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.nickName = nickName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public List<String> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<String> getNickName() {
		return nickName;
	}

	public void setNickName(List<String> nickName) {
		this.nickName = nickName;
	}

}

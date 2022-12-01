package com.masai.assignment.day10.q1;

public class Person {
	
	String  name;
	String  gender;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}

	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	
	
	
	

}

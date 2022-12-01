package com.masai.assignment.day10.q1;

public class Instructor extends Person{

	int instructorId;
	int salary;
	
	


	public Instructor(String name, String gender, int instructorId, int salary) {
		super(name, gender);
		this.instructorId = instructorId;
		this.salary = salary;
	}




	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary + ", name=" + name + ", gender="
				+ gender + "]";
	}
	
	
	
	
	
}

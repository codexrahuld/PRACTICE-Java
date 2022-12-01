package com.masai.assignment.day10.q1;

public class Main {

	
	public static Person generatePerson(Person person) {
		
		
	return person;
	
		
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person newStudent = generatePerson(new Student("rahul", "male", 10, "Java", 50000));
		Person newTeacher = generatePerson(new Instructor("ratan", "male", 14, 10000));
		System.out.println(newStudent);
		System.out.println(newTeacher);
		
		}

		
	

}

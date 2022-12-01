package com.masai.assignment.day4.Q4;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;



public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Student> students = new HashSet<>();
		
		students.add(new Student(12, "N1", 700));
		students.add(new Student(12, "N1", 700));
		students.add(new Student(13, "N3", 500));
		students.add(new Student(15, "N4", 400));
		students.add(new Student(19, "N5", 300));
		
		
		Set<Student> modifiedSet = students.stream().filter((Student s) -> {
			return s.getMarks() < 500 ? true : false ;
		}).collect(Collectors.toSet());
		
		System.out.println("Modified set.................");
		
		modifiedSet.forEach((Student s) -> {
			System.out.println(s);
		});
		
		System.out.println("Original set..................");
		
		students.stream().forEach((Student s) -> {
			System.out.println(s);
		});
		
	}

}

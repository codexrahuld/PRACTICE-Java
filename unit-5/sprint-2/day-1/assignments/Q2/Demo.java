package com.masai.assignment.day4.Q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> students = new ArrayList<>();
		
		students.add(new Student(12, "N1", 700));
		students.add(new Student(14, "N2", 600));
		students.add(new Student(13, "N3", 500));
		students.add(new Student(15, "N4", 400));
		students.add(new Student(19, "N5", 300));
		
		Stream<Student> stream = students.stream();
		
		Optional<Student> opt = stream.max((Student s1, Student s2) -> {
			return s1.getMarks() > s2.getMarks() ? 1 : -1 ;
		});
		
		System.out.println(opt.get());
	}

}
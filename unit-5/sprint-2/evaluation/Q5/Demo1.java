package com.masai.Eval2.Q5;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		List<Student> students = new ArrayList<>();
		
		students.add(new Student(1, "N1", 100, "n1.com", "N1xyz", new Address("Delhi", "delhi", "101001")));
		students.add(new Student(2, "N2", 200, "n2.com", "N2xyz", new Address("UP", "lakhnow", "201001")));
		students.add(new Student(3, "N3", 300, "n3.com", "N3xyz", new Address("MP", "indore", "301001")));
		students.add(new Student(4, "N4", 400, "n4.com", "N4xyz", new Address("Gujrat", "surat", "401001")));
		students.add(new Student(5, "N5", 500, "n5.com", "N5xyz", new Address("Maharshtra", "mumbai", "501001")));
	
	
		FileOutputStream fos = new FileOutputStream("studentdata.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(students);
		
		System.out.println("Succesfully Done....");
		
		oos.close();
	}

}
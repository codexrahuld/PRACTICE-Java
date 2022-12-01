package com.masai.assignment.day8.Q4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		List<Student> list = new ArrayList<>();

		Address a1 = new Address("punjab", "Chandhighar", 235698);

		Student s1 = new Student(1, "Sam", 350, a1);

		Address a2 = new Address("rajasthan", "jaipur", 985647);

		Student s2 = new Student(2, "raman", 450, a2);

		Address a3 = new Address("Haryana", "panipath", 564789);

		Student s3 = new Student(3, "Mahender", 250, a3);

		Address a4 = new Address("uttarakhand", "dehradun", 256795);

		Student s4 = new Student(4, "Roshan", 450, a4);

		Address a5 = new Address("karnataka", "bangore", 123456);

		Student s5 = new Student(5, "Sameer", 550, a4);

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("studentdata.txt"));

		oos.writeObject(list);

		oos.close();

		System.out.println("Students details added successfully......!");
	}

}
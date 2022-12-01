package com.masai.assignment.day8.Q4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("studentdata.txt"));

		List<Student> list = (List<Student>)ois.readObject();

		list.forEach(s -> System.out.println(s));


	}

}
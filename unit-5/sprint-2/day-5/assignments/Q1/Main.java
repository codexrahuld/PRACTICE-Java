package com.masai.assignment.day8.Q1;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee name");
		String name = sc.nextLine();

		System.out.println("Enter Employee address");
		String add = sc.nextLine();

		File f = new File("abc.txt");

		FileWriter fw = new FileWriter(f);

		fw.write("Employee name : "+name);
		fw.write("\n");
		fw.write("Employee Address : "+add);

		fw.flush();
		fw.close();

		System.out.println("Employee detail add sucessfully....");

	}


}
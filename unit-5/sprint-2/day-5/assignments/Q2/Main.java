package com.masai.assignment.day8.Q2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new FileReader("abc.txt"));

		String data = bf.readLine();

		while(data!=null) {

			System.out.println(data);
			data = bf.readLine();

		}
	}
}
package com.masai.assignment.day8.q5;


import java.util.Scanner;

public class Demo {
	public void display(Student[] students) {
		for(Student s:students) {

			System.out.println("Roll is :- "+s.getRoll());
			System.out.println("Name is :- "+s.getName());
			System.out.println("Address is :- "+s.getAddress());
			System.out.println("marks is :- "+s.getMarks());

			System.out.println("--------------------------------------------");

		}
	}

	public void averageMarks(Student[] students) {
		int total=0;
		for(Student ss:students){

			total+=ss.getMarks();
		}
		int avgM = total/(students.length);
		System.out.println("Average marks :- "+avgM);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Students :-");
		int no = sc.nextInt();
		Student[] students = new Student[no];

		for(int i =0;i<students.length;i++) {

			System.out.println("Enter the roll :-");
			int roll = sc.nextInt();

			System.out.println("Enter the name:-");
			String name = sc.next();

			System.out.println("Enter the address :-");
			String address = sc.next();

			System.out.println("Enter the marks :-");
			int marks = sc.nextInt();

			students[i]= new Student(roll,name,address,marks);

		}
		d.display(students);
		d.averageMarks(students);
	}

}
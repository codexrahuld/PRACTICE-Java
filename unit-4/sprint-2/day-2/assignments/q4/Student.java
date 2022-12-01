package com.masai.assignment.day4.q4;

public class Student {

	
	int roll;
	String name;
	int marks;
	
	void displayStudentDetails() {
		System.out.println("Roll is :"+roll);
		System.out.println("Name is :"+name);
		System.out.println("Marks is :"+marks);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu1 = new Student();
		stu1.roll=50;
		stu1.name="Akash";
		stu1.marks=92;
		stu1.displayStudentDetails();
		
		Student stu2 = new Student();
		stu2.roll=13;
		stu2.name="Rahul";
		stu2.marks=70;
		stu2.displayStudentDetails();
		
		stu1=null;
		stu2=stu1;
		
		System.out.println(stu1);
		System.out.println(stu2);
	}

}
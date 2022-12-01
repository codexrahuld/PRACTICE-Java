package com.masai.assignment.day8.q5.Student.java;

public class Student {

	int roll;
	String name;
	String address;
	int marks;

	Student(){

	}
	Student(int roll,String name,String address,int marks){
		this.roll= roll;
		this.name=name;
		this.address=address;
		this.marks=marks;
	}

	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}



}
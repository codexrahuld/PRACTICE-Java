package com.masai.assignment.day8.Q4;


import java.io.Serializable;

public class Student implements Serializable{

	int roll ; 
	String name  ; 
	int marks ;
	Address address ;


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}


	public Student(int roll, String name, int marks, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.address = address;
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


	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
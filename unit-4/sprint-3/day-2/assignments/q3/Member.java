package com.masai.assignment.day9.q3;


public class Member {

	String Name;
	int age;
	String phn;
	String address;
	double salary;

	public double printSalary() {
		return this.getSalary();
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhn() {
		return phn;
	}

	public void setPhn(String phn) {
		this.phn = phn;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
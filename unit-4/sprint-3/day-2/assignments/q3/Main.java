package com.masai.assignment.day9.q3;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Employee e1=new Employee();
		e1.setName("ankit");
		e1.setPhn("9984746267");
		e1.setAddress("tilhar");
		e1.setSalary(1000.00);
		System.out.println("EMPLOYEE DETAILS");
		System.out.println("------------------------------------------");
		System.out.println("emp name - " +e1.getName());
		System.out.println("emp phone - "+e1.getPhn());
		System.out.println("emp address - "+e1.getAddress());
		System.out.println("emp salary - " + e1.printSalary());
		System.out.println("-------------------------------------------");

		Manager m1=new Manager();
		m1.setName("ankur");
		m1.setPhn("90287044655");
		m1.setAddress("jalwa houe");
		m1.setSalary(2000.00);
		System.out.println("MANAGER DETAILS");
		System.out.println("------------------------------------------");
		System.out.println("manager name - " +m1.getName());
		System.out.println("manager phone - "+m1.getPhn());
		System.out.println("manager address - "+m1.getAddress());
		System.out.println("manager salary - " + m1.printSalary());
		System.out.println("-------------------------------------------");

	}

}
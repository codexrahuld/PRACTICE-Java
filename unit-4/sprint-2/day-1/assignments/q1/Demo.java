package com.masai.assignment.day3.q1;

public class Demo {

	public static void printCity(String city) {
		switch(city) {
		case "Mumbai":
			System.out.println("Financial city");
			break;
		
		case "Kolkata":
			System.out.println("City of joy");
			break;
		
		case "Delhi":
			System.out.println("Capital Of The Country");
			break;
			
		case "Bangalore":
			System.out.println("Cyber City");
			break;
			
		default: 
			
		System.out.println("May Be other City of India");
		
		
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printCity("Pune");
	}

}

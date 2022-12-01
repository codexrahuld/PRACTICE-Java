package com.masai.assignment.day4.q2;

public class Main {

	public static void weather(boolean isSnowing, boolean isRaining, double temperature) {
		
		if(isSnowing==true && isRaining==true && temperature<50) {
			
			System.out.println(	"Let’s go out!");
		}
		else {
			System.out.println("Let’s stay home.");

		}
		
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		weather(true,false,50.10);
	}

}

package com.masai.assignment.day7.q3;

import java.util.Scanner;

public class Course {
	int courseId;
	String courseName;
	int courseFee;

	Course(int courseId,String courseName,int courseFee){

		this.courseId=courseId;
		this.courseName=courseName;
		this.courseFee=courseFee;

	}


	public void displayCourseDetails() {
		System.out.println("Couse Details");
		System.out.println("Course Name : "+courseName);
		System.out.println("Course ID : "+courseId);
		System.out.println("Course Fee : "+courseFee);
	}

	public static void authentication(String username , String password) {
		if(username.equals("Admin")&password.equals("1234")) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Course Name : ");
			String courseName = sc.nextLine();

			System.out.println("Enter Course ID : ");
			int courseId = sc.nextInt();

			System.out.println("Enter Course Fee : ");
			int courseFee = sc.nextInt();

			Course c1 = new Course(courseId,courseName,courseFee);
			c1.displayCourseDetails();
		}
		
		else {
			System.out.println("Invalid Username or password");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner se = new Scanner(System.in);
		System.out.println("Enter the UserName : ");
		String username = se.nextLine();

		System.out.println("Enter the Password : ");
		String password = se.nextLine();
		authentication(username,password);
		
		se.close();
	}

}

/*Write a function that asks the user to input his/her name and age
(use Scanner class) and prints the same on the console.
*/


package com.masai.Q4;
import java.util.Scanner;
public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Enter Name");
		String name = Scanner.nextLine();
		
		System.out.println("Enter Age");
		int age = Scanner.nextInt();
		
		Scanner.close();
		System.out.println("Name:- "+name+" , "+" Age- "+age);	

	}

}

package com.masai.assignment.day13.q2;


import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integer1");
		int a=sc.nextInt();
		
		System.out.println("Enter Integer2");
		int b=sc.nextInt();
		
		sc.close();
		
		try {
			division(a,b);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		     System.out.println("DivideByZeroException caught");
		}
		finally {
			System.out.println("Inside finally block");
		}
		

	}
	
    static void division(int a,int b) {
    	System.out.println("The quotient of"+" "+a+"/"+b+"="+a/b);
    }

}

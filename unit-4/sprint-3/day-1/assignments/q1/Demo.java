

package com.masai.assignment.day8.q1;
import java.util.Scanner;
public class Demo {
	
	 
	public static String reversString(String str){
		
		//write the logic
		char[] array= str.toCharArray();
		char[] newArr = new char[array.length];
		
		for(int i=0;i<array.length;i++) {
			
			newArr[i]=array[i];
		}
		
		StringBuilder result = new StringBuilder("");
		
		for(int i=newArr.length-1;i>=0;i--) {
			
			result.append(newArr[i]);
			
		}
		
		return result.toString();
		
		
		
	}
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String to reverse");
	String orignalString = sc.next();
	
	
	String result = reversString(orignalString);
	
	System.out.println("Original String is :"+ orignalString);
	System.out.println("Reversed String is :"+ result);
	sc.close();
	}

				
	}

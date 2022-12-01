

/*Q1: Explain the difference between == operator and equals() method
with a code example.
Ans:->   1)In the java language == operator and equals() method are used for different purposes. 
			2)In the java == is the relational operator which checks if the values of two operands are equal or not,
			If yes then condition becomes True.
			3)equals() is a method available in a object class and is used to compare objects for equality.
			4)In general both are used to check the equality of two objects or variables.
			5) == is an operator, Whether equals() is a method.
			6) == checks if both references points to same locaion or not.  equals() method evaluates the content to check the equality.
			 

*/



package com.masai.Q1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String s1 = "hello";
			String s2 = "hello";
			String s3 = new String ("hello");
			
			System.out.println(s1==s2);
			System.out.println(s1==s3);
			System.out.println(s1.equals(s2));
			System.out.println(s1.equals(s3));
			
	}
}
			
			
			
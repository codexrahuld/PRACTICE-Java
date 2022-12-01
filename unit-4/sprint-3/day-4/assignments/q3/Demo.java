package com.masai.assignment.day11.q3;



public class Demo {
	
	/*
	 Q3) Why is multiple inheritance not supported in Java at class level ?
	 Answer:-
	         Multiple Inheritance:-It is an feature in OOP, where a class can inherit property from more 
	         than one parent class.
	         
	         The problem occurs when there exist methods with same signature in the both the super-class,
	         then if we call the method,then the compiler can't determine which method should be called.
	         So that is the reasion java compiler does't support multiple inheritance.          
	 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

class Parent1{
	void fun() {
		System.out.println("Parent1");
	}
}

class Parent2{
	void fun() {
		System.out.println("Parent2");
	}
}

//Trying to inherit from two different class but JVM will throw CE.

//class Child extends Parent1,Paren2{
	//	
	//}



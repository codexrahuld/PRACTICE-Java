


/*Q1)  Is there any difference between creating a string with and without a new operator?  
        Explain with an example.
Ans) Yes, there is difference between creating a string with and without a new operator are:

	two ways of creating String are :
	1) String s1 = "welcome" in this only one object create.
	2) String s1 = new Sting("welcome") int his two object create.

	ex :
	====
Ans*/

package com.masai.assignment.day7.q1;

public class Demo {


	public static void main(String[] args) {


		String s1 = "Welcome";

		String s2 = new String("Hello");
		
		System.out.println(s1);
		System.out.println(s2);


	}

}

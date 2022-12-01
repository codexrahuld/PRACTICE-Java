

/*Write a function that takes a string “s” and an integer “i” as an
argument. It should return the first “i” characters.
*/


package com.masai.Q6;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String stri = "abcdefgh";
		int position=2;
		subString(stri,position);

	}
	
	static void subString(String stri, int position)  {
		System.out.println(stri.substring(0,position+1));
	}

}

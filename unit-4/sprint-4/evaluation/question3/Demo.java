package com.masai.question3;

public class Demo {

	public static void main(String[] args) {
		
		int[] arr=new int[10];
		
		Object obj=null;
		
		
		try {
			
			arr[11]=100; //This Will Throw ArrayIndexOfBoundException;
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("We are catcthing ArrayIndexOutOfBoundsException");
			
		}
		catch(NullPointerException e) {
			System.out.println("We are catching NullPointerException");
			
		}
		finally {
			System.out.println("It will execute always");
		}
	}
	
	
	
}

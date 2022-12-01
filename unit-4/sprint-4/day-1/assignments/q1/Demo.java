package com.masai.assignment.day13.q1;


import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Username");
         String name=sc.next();
         
         System.out.println("Enter Country Name");
         String country=sc.next();
         sc.close();
		 try {
			   registerUser(name, country);
	        }
	        catch (InvalidCountryException ex) {
	            System.out.println("InvalidCountryException Caught");
	            ex.printStackTrace();
	        }
	}
	
	public static void registerUser(String name,String country)throws InvalidCountryException{
		if(country.equals("India")==false) {
			throw new InvalidCountryException("User Outside India cannot be registere");		
		}
		else {
			System.out.println("User registration done successfully");
		}
	}
	
}


class InvalidCountryException extends Exception{
    public InvalidCountryException(String s){
        super(s);
    }
}






package com.masai.assignment.day10.q3;


import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your hotel budget");
		
		int bug=sc.nextInt();
		sc.close();
		
		System.out.println(provideFood(bug));
		
	
	}
	public static Question3 provideFood(int amount) {
		if(amount>1000) {
			return new TajHotel();
		}
		else {
			return new RoadSideHotel();
		}
	}

}

class Hotel{
   public String name;
   public int rating;
}

class TajHotel extends Question3{
	String name="TajHotel";
	int rating=5;
	@Override
	public String toString() {
		return "TajHotel [name=" + name + ", rating=" + rating + "]";
	}
	
}

class RoadSideHotel extends Question3{
   String name="RoadSideHotel";
   int rating=1;
@Override
public String toString() {
	return "RoadSideHotel [name=" + name + ", rating=" + rating + "]";
}
   
}

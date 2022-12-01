package com.masai.assignment.day12.q2;



import java.util.Scanner;
public class Demo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Budget for hotel");
	    int budget=sc.nextInt();
	    
	    Demo obj=new Demo();
	    
	    sc.close();
	    
	    if(obj.provideFood(budget)!=null) {
	       System.out.println(obj.provideFood(budget));
	    }
	    else {
	    	System.out.println("Invalid amount entered");
	    }

	}
	
	public Hotel provideFood(int amount) {
		if(amount>1000) {
			 TajHotel obj=new TajHotel();
			 return obj;
		}
		else if(amount>=200 && amount<=1000) {
			RoadSideHotel obj=new RoadSideHotel();
			return obj;
		}
		return null;
	}
}



interface Hotel{
	void chickenBiryani();
	void masalaDosa();
}

class TajHotel implements Hotel{

	@Override
	public void chickenBiryani() {
		// TODO Auto-generated method stub
		System.out.println("Biryani Serving in Taj");
		
	}

	@Override
	public void masalaDosa() {
		// TODO Auto-generated method stub
		System.out.println("Dosa serving in Taj");
		
	}
	
	public void welcomeDrink(){
		System.out.println("Welcome Drink from the TajHotel");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		this.welcomeDrink();
		this.chickenBiryani();
		this.masalaDosa();
		return "TajHotel";
	}
}

class RoadSideHotel implements Hotel{

	@Override
	public void chickenBiryani() {
		// TODO Auto-generated method stub
		System.out.println("Biryani Serving in footpath");
		
	}

	@Override
	public void masalaDosa() {
		// TODO Auto-generated method stub
		System.out.println("Dosa serving in footpath");
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		this.chickenBiryani();
		this.masalaDosa();
		return "RoadSideHotel";
	}
}
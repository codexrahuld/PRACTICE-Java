package com.masai.assignment.day5.Q7;


public class Main {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadA ta= new ThreadA();
		
		
		Thread t1= new Thread(ta);
		Thread t2= new Thread(ta);
		
		t1.setName("Dhoni");
		t2.setName("Kohli");
		
		t1.setPriority(8);
		t2.setPriority(10);
		
		t1.start();
		t2.start();
		
//	Thread.currentThread().setName("Main Thread");
//	System.out.println(Thread.currentThread().getName());
		

	}

	

	

	

}
package com.masai.Eval2.Q4;

public class Demo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method
		
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		Thread th3 = new Thread(t3);
		
		
		th1.setName("Kohli");
		th2.setName("Dhoni");
		th3.setName("Rohit");
		
		th1.setPriority(3);
		th2.setPriority(2);
		th3.setPriority(1);
		
		
		th2.start();
		
		th3.start();
		
		th1.start();
		
	}

}

package com.masai.Eval2.Q2;


public class Main {
	
		public static void main(String[] args) {
			
			
			MyThread t1 = new MyThread();
			
			Thread t2 = new Thread(t1);
			
			t2.start();
			
			synchronized (t2) {
				
				try {
					
					t2.wait();
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				System.out.println("Product : "+t1.num);
			}
			
		}

}

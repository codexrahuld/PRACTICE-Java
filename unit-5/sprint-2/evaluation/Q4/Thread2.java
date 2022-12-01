package com.masai.Eval2.Q4;

public class Thread2 implements Runnable {

	
		int sum = 0;
		
		@Override
		public void run( ) {
			//TODO Auto-generated method
			
			
			synchronized (this) {
				
				
				try {
					this.notifyAll();
				}
				
				catch (Exception e) {
					System.out.println(e);
				}
				
				for(int i=1;i<=20;i++) {
					sum = sum+i;
				}
				
				System.out.println("Dhoni Thread ---> "+sum);
			}
		}
}

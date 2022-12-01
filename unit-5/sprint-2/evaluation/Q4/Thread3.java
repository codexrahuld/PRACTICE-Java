package com.masai.Eval2.Q4;

public class Thread3 implements Runnable {
	
	int product = 1;
	
	@Override
	
	public void run() {
		//TODO Auto-generated method
		
		
		synchronized (this) {
			
			try {
				this.wait(1000);
				
			}
			catch (Exception e) {
				System.out.println(e);
			}
			
			for(int i=1;i<=10;i++) {
				product = product*1;
			}
			
			System.out.println("Rohit Thread ---> "+product);
		}
	}

}

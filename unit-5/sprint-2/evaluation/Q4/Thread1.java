package com.masai.Eval2.Q4;

public class Thread1 implements Runnable {

	
	@Override
	
	public void run() {
		//TODO Auto-generated method
		
		
		synchronized (this) {
			
			try {
				this.wait(3000);
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
			
			for(int i=1;i<=10;i++) {
				System.out.println("Kohli Threadd --->"+i);
			}
		}
	}
}

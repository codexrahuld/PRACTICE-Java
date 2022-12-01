	package com.masai.Eval2.Q2;

 	public class MyThread extends Thread{
	
	int num = 1;
	
	@Override
	public void run() {
		
		
		synchronized (this) {
			
			for(int i=1;i<=10;i++) {
				
				
				num=num*i;
				
			}
			
			this.notify();
		}
	}

}

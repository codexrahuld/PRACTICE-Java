package com.masai.assignment.day5.Q7;


public class ThreadA implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			String tname= Thread.currentThread().getName();
			int p= Thread.currentThread().getPriority();
			System.out.println(tname+"is running"+i +"And Priority is:"+p);
		}
		System.out.println("ENd of thread A");
	}

	
}
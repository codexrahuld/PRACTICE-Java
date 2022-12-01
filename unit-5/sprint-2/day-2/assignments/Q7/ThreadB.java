package com.masai.assignment.day5.Q7;


public class ThreadB implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=20;i<30;i++)
		{
			String tname= Thread.currentThread().getName();
			int p= Thread.currentThread().getPriority();
			System.out.println(tname+"is running"+i +"And Priority is:"+p);
		}
		System.out.println("End of thread B");
	}

}
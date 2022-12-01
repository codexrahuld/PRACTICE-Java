package com.masai.assignment.day6.Q3;


public class oddThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i++)
		{
			if(i%2!=0)
			{
				System.out.println("odd Number"+i);
			}
		}
		System.out.println("End of Odd Thread");
	}

}
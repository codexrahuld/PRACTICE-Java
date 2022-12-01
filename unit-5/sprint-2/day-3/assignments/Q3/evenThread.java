package com.masai.assignment.day6.Q3;

public class evenThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(500);
			for(int i=0;i<=20;i++)
			{
				if(i%2==0)
				{
					System.out.println("Even number"+i);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

		System.out.println("End of Even Thread");

	}

}
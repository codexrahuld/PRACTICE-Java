package com.masai.assignment.day7.Q6;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {

		Check[] nums = {

				new Check(10),
				new Check(11),
				new Check(12),
				new Check(100),
				new Check(150),
				new Check(17)

		};

		ExecutorService ser = Executors.newFixedThreadPool(3);

		for(Check i : nums) {

			Future f = ser.submit(i);
			try {
				System.out.println(f.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		ser.shutdown();

	}

}
package com.masai.assignment.day6.Q3;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		evenThread et= new evenThread();
		oddThread ot= new oddThread();

		Thread evenT= new Thread(et);
		Thread oddT= new Thread(ot);

		evenT.start();
		try {
			evenT.join();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}


		oddT.start();

		try {
			oddT.join();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
package com.masai.assignment.day7.Q1;


public class Main {

	public static void main(String[] args) {

		ThreadA t = new ThreadA();

		t.start();

		synchronized (t) {

			try {
				t.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}

		System.out.println(t.pro);

	}
}
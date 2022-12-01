package com.masai.assignment.day7.Q6;


import java.util.concurrent.Callable;

public class Check implements Callable{

	int num ;



	public Check(int num) {
		super();
		this.num = num;
	}



	@Override
	public Object call() throws Exception {

		if(num%2==0) {

			return "Even" ;
		}else
			return "Odd" ;

	}

}
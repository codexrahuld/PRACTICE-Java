package com.masai.Eval2.Q3;


	import java.util.concurrent.Callable;
	
	
public class Product implements Callable<Integer> {
	
	int num;
	
	
	public Product() {};
	
	public Product(int num) {
		super();;
		this.num = num;
		
	}
	
	@Override
	public Integer call() throws Exception {
		int ans =1;
		System.out.println(Thread.currentThread().getName()+" is responsible for finding factorial of "+num);
		
		for(int i=1;i<num;i++) {
			ans=ans*i;
		}
		return ans;
	}
	
}

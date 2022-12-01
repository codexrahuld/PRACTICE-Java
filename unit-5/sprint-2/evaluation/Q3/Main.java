package com.masai.Eval2.Q3;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Main {

		public static void main(String[] args) throws Exception {
			 
			Product[] task = {new Product(5), new Product(7), new Product(3), new Product(6), new Product(33), new Product(11)};
			
			ExecutorService service = Executors.newFixedThreadPool(3);
			
			
			for(Product t:task) {
				Future f=service.submit(t);
				System.out.println(f.get());
			}
		}
}

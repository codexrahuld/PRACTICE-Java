package com.masai.assignment.day8.q4;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==1){
			int fact =1;
			int num = Integer.parseInt(args[0]);
			for(int i=1;i<=num;i++) {
				fact*=i;
			}
			System.out.println("Fact of num is :- "+fact);	
		}else if(args.length==2) {
			int diff;
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			diff = Math.abs(n1-n2);
			
			System.out.println("Absolute Difference is :- "+diff);
		}
		else 
		{
			System.out.println("Error");
		}

	}

}

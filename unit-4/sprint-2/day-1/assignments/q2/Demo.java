package com.masai.assignment.day3.q2;

public class Demo {

	public static void primeFactors(int n)
	 {
		// TODO Auto-generated method stub

			
		for(int i=1; i<=n; i++) {
			
			if(n%i==0) {
				System.out.println(i);
			}
		}
	 }
 
    public static void main(String[] args)
    {
        primeFactors(90);
    }
}
 



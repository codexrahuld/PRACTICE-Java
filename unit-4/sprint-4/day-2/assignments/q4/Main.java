package com.masai.assignment.day12.q4;


import java.util.*;
//Main class.
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		sc.close();
	    
		int[] ans=t.display(num);
		
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}

	}
   static boolean isPrime(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
		 }	
    }
		return true;
}
    
}

//Interface.
interface Intr{
  int[] display(int p);
}

//Test class.
class Test implements Intr{
	@Override
	public int[] display(int p) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=2;i<=p;i++) {
          if(Main.isPrime(i)==true){
        	  list.add(i);
          }
		}
		int[] arr=new int[list.size()];
		
		for(int j=0;j<arr.length;j++) {
			arr[j]=list.get(j);
		}
		return arr;
	}	
}
		
package com.masai.question2;


import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(8);
		arr.add(1);
		arr.add(2);
		arr.add(2);
		arr.add(3);
		System.out.println(check(arr,4));
	}
	
	static int check(ArrayList<Integer>arr,int k) {
		int ans=0;
		Set<Integer>set= new HashSet<>();
		for(int i=0;i<arr.size();i++) {
			set.add(arr.get(i));
		}
		Iterator<Integer> val = set.iterator();
		
		while(val.hasNext()) {
			if(val.next()<k) {
				ans++;
			}
		}
		return ans;
	}

}

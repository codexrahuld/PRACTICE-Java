/*Write a function that doubles all the values inside the given
integer array and returns the array with doubled values.abstract 
*/


package com.masai.Q5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = {1,2,3,4,5};
		Double(intArray);
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]+" ");
		}

	}
	
	static void Double(int[]array) {
		for(int i=0;i<array.length;i++) {
			array[i]=array[i]*2;
		}
	}

}

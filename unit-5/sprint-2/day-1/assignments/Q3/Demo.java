package com.masai.assignment.day4.Q3;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		
		Stream<Integer> stream = intList.stream();
		
		Stream<Integer> stream2 = stream.map((Integer i) -> {
			return i*i;
		});
		
		List<Integer> modifiedList = stream2.collect(Collectors.toList());
		
		System.out.println("Printing original list......................");
		
		intList.forEach((Integer i) -> {
			System.out.println(i);
		});
		
		System.out.println("Printing original list......................");
		
		modifiedList.forEach((Integer i) -> {
			System.out.println(i);
		});
	}

}

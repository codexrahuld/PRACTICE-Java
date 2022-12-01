package com.masai.assignment.day4.Q1;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> products = new ArrayList<>();
		
		products.add(new Product(1, "p1", 500, 5));
		products.add(new Product(2, "p2", 400, 10));
		products.add(new Product(3, "p3", 300, 15));
		products.add(new Product(4, "p4", 200, 20));
		products.add(new Product(5, "p5", 100, 25));
		
		Stream<Product> stream1 = products.stream();
		
		Stream<Product> stream2 = stream1.filter((Product p) -> {
			return p.getQuantity() > 10 ;
		});
		
		Stream<Product> stream3 = stream2.sorted(Comparator.comparingDouble(Product::getPrice));
	
		List<Product> modifiedProducts = stream3.collect(Collectors.toList());
		
		System.out.println("Products from original list ...............................");
		
		for(Product i:products) {
			System.out.println(i);
		}
		
		System.out.println("Products from filtered list................................");
		
		for(Product i:modifiedProducts) {
			System.out.println(i);
		}
		
	}

}
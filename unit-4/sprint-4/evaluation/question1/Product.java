package com.masai.question1;

public class Product implements Comparable<Product>{
	

	
	private String productName;
	
	private Double productPrice;
	
	
	public Product(String productName, Double productPrice )
	{
		
		this.productName=productName;
		this.productPrice=productPrice;
		
	}
	
	@Override 
	
		public int compareTo(Product o) {
		if(this.productPrice == o.productPrice) {
			return 0;
		}
		else if(this.productPrice>o.productPrice) {
			return 1;
		}else {
			return -1;
		}
	}
	
	
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productPrice=" + productPrice + "]";
	}
}

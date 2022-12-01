package com.Usecases;

import java.util.List;
import java.util.Scanner;

import com.Been.ProductBeen;
import com.Dao.*;
import com.exception.ProductException;

public class GetProductsLessQuanUsecase {

	public static void main(String[] args) {
       
       Scanner sc=new Scanner(System.in);
		System.out.println("Enter Quantity");
		int qua=sc.nextInt();
		sc.close();
		Productdao dao = new ProductdaoImpl(); 
		
		try {
			List<ProductBeen> list = dao.getAllProductQuantityLessThan(qua);
			list.forEach(e-> System.out.println(e));
		} 
		catch (ProductException e) {
			// TODO Auto-generated catch block
		    System.out.println(e.getMessage());
			e.printStackTrace();
		}
       
       
	}

}

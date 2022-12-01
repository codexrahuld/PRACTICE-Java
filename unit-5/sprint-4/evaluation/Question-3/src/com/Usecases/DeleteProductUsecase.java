package com.Usecases;

import java.util.Scanner;

import com.Dao.*;
import com.exception.ProductException;

public class DeleteProductUsecase {

	public static void main(String[] args) {
		Productdao dao = new ProductdaoImpl();
		
        Scanner sc=new Scanner(System.in);
        
		System.out.println("Enter name");
		String name=sc.next();
		
		sc.close();
		
		try {
			String ans = dao.deleteProductByProductName(name);
			System.out.println(ans);
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		 
	}

}

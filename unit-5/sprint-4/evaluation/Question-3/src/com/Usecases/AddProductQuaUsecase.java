package com.Usecases;

import java.util.Scanner;

import com.Dao.*;
import com.exception.ProductException;

public class AddProductQuaUsecase {

	public static void main(String[] args) {
      Productdao dao = new ProductdaoImpl();
      
      Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ProductId");
		int Id=sc.nextInt();
		
		System.out.println("Enter Quantity");
		int qua=sc.nextInt();
		
		sc.close();
		
		try {
			String res = dao.addProductQuantity(Id, qua);
			
			System.out.println(res);
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}

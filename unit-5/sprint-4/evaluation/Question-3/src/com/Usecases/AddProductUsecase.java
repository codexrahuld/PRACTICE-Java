package com.Usecases;

import java.util.Scanner;

import com.Been.ProductBeen;
import com.Dao.*;
import com.exception.ProductException;

public class AddProductUsecase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ProductId");
		int Id=sc.nextInt();
		
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("Enter Price");
		int pri=sc.nextInt();
		
		System.out.println("Enter Quantity");
		int qua=sc.nextInt();
		
		sc.close();
		
		Productdao dao = new ProductdaoImpl();
        
		try {
			String mes = dao.addProduct(new ProductBeen(Id, name, pri, qua));
			
			System.out.println(mes);
		}
		catch (ProductException e) {
			System.out.println(e.getMessage());
		}
	}

}

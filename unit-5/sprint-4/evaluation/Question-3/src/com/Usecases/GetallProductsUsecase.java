package com.Usecases;

import java.util.List;

import com.Been.ProductBeen;
import com.Dao.*;
import com.exception.ProductException;

public class GetallProductsUsecase {

	public static void main(String[] args) {
	   Productdao dao = new ProductdaoImpl();
	   
	   try {
		List<ProductBeen> list = dao.getAllProducts();
		
		list.forEach(e-> System.out.println(e));
	} 
	 catch (ProductException e) {
		  System.out.println(e.getMessage());
	}

	}

}

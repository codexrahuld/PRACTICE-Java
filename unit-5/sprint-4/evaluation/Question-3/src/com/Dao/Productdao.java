package com.Dao;

import java.util.*;

import com.Been.ProductBeen;
import com.exception.ProductException;

public interface Productdao {

	 public String addProduct(ProductBeen product) throws ProductException;
	 
	 public List<ProductBeen> getAllProducts() throws ProductException;
	 
	 public List<ProductBeen> getAllProductQuantityLessThan(int quantity)throws ProductException;
	 
	 public String addProductQuantity(int productId, int Quantity)throws ProductException;
	 
	 public String deleteProductByProductName(String pname)throws ProductException;
	 
	 public ProductBeen getProductByProductName(String pname)throws ProductException;
}

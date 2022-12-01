package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Been.ProductBeen;
import com.Utility.DbUtil;
import com.exception.ProductException;

public class ProductdaoImpl implements Productdao {

	@Override
	public String addProduct(ProductBeen p) throws ProductException {
		String mess=null;
		try(Connection con = DbUtil.ConnectionProvider()) {
			PreparedStatement ps = con.prepareStatement("insert into Products values(?,?,?,?)");
			
			ps.setInt(1,p.getPid());
			ps.setString(2,p.getName());
			ps.setInt(3,p.getPrice());
			ps.setInt(4,p.getQun());
			
			int x = ps.executeUpdate();
			
			if(x>0) mess="Insertion Done";
			
		} 
		catch (SQLException e) {
		   throw new ProductException(e.getMessage());
		}
		return mess;
	}

	@Override
	public List<ProductBeen> getAllProducts() throws ProductException {
		ArrayList<ProductBeen> list = new ArrayList<>();
        try(Connection con = DbUtil.ConnectionProvider()) {
        	PreparedStatement ps = con.prepareStatement("Select * from Products");
        	
        	ResultSet rs = ps.executeQuery();
        	
        	while(rs.next()) {
        		list.add(new ProductBeen(rs.getInt("ProductId"),rs.getNString("ProductName"),rs.getInt("Price"),rs.getInt("Quantity")));
        	}
        	
		} 
		catch (SQLException e) {
		    throw new ProductException(e.getMessage());
		}
        
        if(list.size()==0) throw new ProductException("Empty..");
			
        return list;
	}

	@Override
	public List<ProductBeen> getAllProductQuantityLessThan(int quantity) throws ProductException {
		ArrayList<ProductBeen> list = new ArrayList<>();
		
        try(Connection con = DbUtil.ConnectionProvider()) {
	        PreparedStatement ps = con.prepareStatement("Select * from Products Where Quantity < ?");
	        ps.setInt(1, quantity);
        	
        	ResultSet rs = ps.executeQuery();
        	
        	while(rs.next()) {
        		list.add(new ProductBeen(rs.getInt("ProductId"),rs.getNString("ProductName"),rs.getInt("Price"),rs.getInt("Quantity")));
        	}
		} 
		catch (SQLException e) {
			throw new ProductException(e.getMessage());
		}
        
        if(list.size()==0) throw new ProductException("Product Not Exist");
 
		return list;
	}

	@Override
	public String addProductQuantity(int productId, int Quantity) throws ProductException {
		String mess=null;
		  try(Connection con = DbUtil.ConnectionProvider()) {
				PreparedStatement ps = con.prepareStatement("Update Products Set Quantity=? Where ProductId=?");
				
				ps.setInt(1, Quantity);
				ps.setInt(2, Quantity);
				
				int x = ps.executeUpdate();
				if(x>0) mess="Update Done..";
			} 
			catch (SQLException e) {
				throw new ProductException(e.getMessage());
			}
		return mess;
	}

	@Override
	public String deleteProductByProductName(String pname) throws ProductException {
		String mess=null;
		  try(Connection con = DbUtil.ConnectionProvider()) {
				PreparedStatement ps = con.prepareStatement("Delete From Products where ProductName=?");
				
				ps.setString(1,pname);
				
				int x = ps.executeUpdate();
				
				if(x<0) throw new ProductException(x+"No rows Deleted");
			} 
		  catch (SQLException e) {
				e.printStackTrace();
			}
		return mess;
	}

	@Override
	public ProductBeen getProductByProductName(String pname) throws ProductException {
		ProductBeen res=new ProductBeen();
		 try(Connection con = DbUtil.ConnectionProvider()) {
				PreparedStatement ps = con.prepareStatement("Select * from Products where ProductName=?");
				
				ps.setString(1, pname);
				
				ResultSet rs = ps.executeQuery();
				
				if(rs.next()) {
					res=new ProductBeen(rs.getInt("ProductId"),rs.getString("ProductName"),rs.getInt("Price"),rs.getInt("Quantity"));
				}
				else {
					throw new ProductException("Product Not Exist With That Id");
				}
			} 
		 catch (SQLException e) {
				throw new ProductException(e.getMessage());
			}
		return res;
	}

	

}

package com.Been;

public class ProductBeen {
  private int Pid;
  private String name;
  private int price;
  private int qun;
  
  public ProductBeen() {
	// TODO Auto-generated constructor stub
   }
	
	public ProductBeen(int pid, String name, int price, int qun) {
		super();
		Pid = pid;
		this.name = name;
		this.price = price;
		this.qun = qun;
	}
	
	@Override
	public String toString() {
		return "ProductBeen [Pid=" + Pid + ", name=" + name + ", price=" + price + ", qun=" + qun + "]";
	}
	
	public int getPid() {
		return Pid;
	}
	
	public void setPid(int pid) {
		Pid = pid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getQun() {
		return qun;
	}
	
	public void setQun(int qun) {
		this.qun = qun;
	}
  
  
}

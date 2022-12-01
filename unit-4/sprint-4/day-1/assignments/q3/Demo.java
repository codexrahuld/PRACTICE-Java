package com.masai.assignment.day13.q3;




public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a1=new Account("123456789");
		Account a2=new Account("110119562853");
		a1.deposit(2000);
	    try {
	    	a1.withdraw(1000);
	    	a2.withdraw(100);
		} 
	    catch (InsufficientFundsException e) {
//			e.printStackTrace();
	    	System.out.println("InsufficientFundsException cought Insufficient Account Balance");
		}
	    finally {
	    	System.out.println(a1);
	    	System.out.println(a2);
	    }
		

	}

}

class Account{
	String accountNumber;
	double balance;
	
	public Account(){};
	
	Account(String acNumber){
		accountNumber=acNumber;
	}
	
	void deposit(int amt) {
		balance=balance+amt;
	}
	
	double withdraw(int amt)throws InsufficientFundsException{
		   if(amt>balance) {
			   throw new InsufficientFundsException("Insufficient Balance");
		   }
		   double withdraw=balance-amt;
		   
		   this.balance=balance-amt;
		   
		   return withdraw;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
	
}



//User-defined Checked-Exception. 
class InsufficientFundsException extends Exception{
	  public InsufficientFundsException(String s) {
		super(s);
	}
}
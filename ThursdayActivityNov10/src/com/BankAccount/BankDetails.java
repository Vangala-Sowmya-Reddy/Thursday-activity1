package com.BankAccount;

public class BankDetails {
	private Bank[] account;
	private int entry;
	
	BankDetails()
	{
		account=new Bank[4];
				
	}
public void checkBalance(Bank input)
{
	if(entry<account.length) 
	{
		account[entry]=input; 
		entry++; 
		
		if(input.getBalance()<(1000))
		System.out.println("Low Balance Account Details are :"+  input.getName() + ", Rs." + input.getBalance()); 
	}
}
	public static void main(String[] args) {
		
		Bank b1 = new Bank("Anusha",768543,6675.90);
		Bank b2 = new Bank("Sowmya",768546,677.75);
		Bank b3 = new Bank("Kavya",768541,123453.96);
		Bank b4 = new Bank("Madhuri",768452,97654);
		
		BankDetails myBank = new BankDetails();
		myBank.checkBalance(b1);
		myBank.checkBalance(b2);
		myBank.checkBalance(b3);
		myBank.checkBalance(b4);
	}

}

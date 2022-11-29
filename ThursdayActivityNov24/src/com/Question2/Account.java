package com.Question2;

public class Account {
	
	public void deposit()
	{
		System.out.println("Deposit here");
		
	}
	void withdraw(int balance) throws UserDefinedException
	{ 
		if(balance<100)
		{
			throw new UserDefinedException("No SufficientFundException");
			
		}
		else {
			System.out.println("Please take money");
		}
	}
	public static void main(String[] args) {
		

		Account a=new Account();
		a.deposit();
		
		try {
			a.withdraw(3000);
		}
		catch(Exception e)
		{
			
			System.out.println(e.getMessage());
		}

	}


}

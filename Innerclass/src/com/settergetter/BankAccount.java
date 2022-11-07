package com.settergetter;

public class BankAccount {
      private String name;
      private String email_id;
      private int accountnum;
      private int ammount;
      
      public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail_id() {
		return email_id;
	}



	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}



	public int getAccountnum() {
		return accountnum;
	}



	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}



	public int getAmmount() {
		return ammount;
	}



	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}
public static void main(String[] args) {
	BankAccount a1= new BankAccount() ;
	BankAccount a2= new BankAccount() ;
	a1.setName("Sowmya");
	a1.setEmail_id("sowmya@gmail.com");
	a1.setAccountnum(34264);
	a1.setAmmount(300000);
	/*System.out.println("Account holder name is "+a1.getName());
	System.out.println("Account holder Email_id is "+a1.getEmail_id());
	System.out.println("Account holder account number is "+a1.getAccountnum());
	System.out.println("Account holder total ammount is "+a1.getAmmount());*/
	System.out.println("Details of first customer: ");
	System.out.println(a1.getName()+",Email id:"+a1.getEmail_id()+" ,"+"Account number: "+a1.getAccountnum()+","+"Total Ammount: "+a1.getAmmount());
	System.out.println("---------------------------");
	a2.setName("Geeta");
	a2.setEmail_id("Geeta@gmail.com");
	a2.setAccountnum(34274);
	a2.setAmmount(500000);
	System.out.println("Details of Second customer:");
	System.out.println(a2.getName()+",Email id:" +a2.getEmail_id()+","+"Account number: "+a2.getAccountnum()+","+"Total Ammount: "+a2.getAmmount());
	
	/*System.out.println("Account holder name is "+a2.getName());
	System.out.println("Account holder Email_id is "+a2.getEmail_id());
	System.out.println("Account holder account number is "+a2.getAccountnum());
	System.out.println("Account holder total ammount is "+a2.getAmmount());*/
	
		

	}


}

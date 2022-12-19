package com.thursdayactivitydec15maven;

//import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import java.util.Scanner;

class EmployeeTest {

EmpDetails emp=new EmpDetails();
	
	@Test
	public void testCalculateAppraisal()
	{
		emp.setEmployeeName("Sowmya Reddy");
		emp.setAge(25);
		emp.setSalary(2500);
		
		
		double appraisal;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Salary");
		appraisal=sc.nextDouble();
		
		double calculate_appraisal;
		
		
		double appr;
		if(appraisal >= 12000)
		{
			calculate_appraisal= appraisal * 20 / 100;
			appr=appraisal*12;

			/*
			 * System.out.println("Employee name:"+emp.getEmployeeName());
			System.out.println("Monthly appraisal:"+calculate_apprisal);
			System.out.println("Yearly total appraisal:"+appraisal);
			*/
		}
		else
			calculate_appraisal= appraisal * 10 / 100;
			appr=appraisal*12;
/*
			System.out.println("Employee name"+emp.getEmployeeName());
			System.out.println("Monthly appraisal: "+calculate_apprisal);
			System.out.println("Yearly total appraisal: "+appraisal);
		*/
		
	}
}

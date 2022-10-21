package com.cyclicalRotationOfArray;

import java.util.Arrays;

public class CyclicalRotationOfArray {
	
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		/*System.out.println("Enter size of the array: ");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		System.out.println("Enter elements of the array: ");
		for(int i=0;i<size;i++)
		{
		a[i]=s.nextInt();
		}*/
		System.out.println("Original array is: "+Arrays.toString(a));	
	 
		int x=a[a.length-1];
		
		
			
		    for(int i=(a.length-1);i>0;i--)
		    {
		    	
	              a[i]=a[i-1];
	          
		    }
		    	
		  a[0]=x;
		System.out.println("Rotated array clockwise by one is: "+Arrays.toString(a));
	}
}
		
		
       


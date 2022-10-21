package com.arrayreverse;

import java.util.Arrays;

public class ArrayReverse {
	
static void reverse(int arr[],int n)
{
			int[] revarr=new int[n];
			int j=n;
			for(int i=0;i<n;i++)
			{
				revarr[j-1]=arr[i];
			
			    j=j-1;
		    }
			System.out.println("Reversed array is: "+Arrays.toString(revarr));
}
	

public static void main(String[] args) {
	int []a= {10,20,30,40,50,60};
	System.out.println("original array is: "+Arrays.toString(a));
	reverse(a,a.length);
}
}


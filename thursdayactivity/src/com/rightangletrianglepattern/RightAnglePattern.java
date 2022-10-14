package com.rightangletrianglepattern;

public class RightAnglePattern {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
		  for(int j=1;j<=i;j++)
		   {
				  System.out.print(j+ " ");
			     
		   }
		  
		 System.out.println();
		}
		
		
	}

}
/*i=1,j=i=1,k=j=1;1
i=2,j=1<2,k<=1;k=1&k++  j=2<=2,k<=2;k=2&k++*/

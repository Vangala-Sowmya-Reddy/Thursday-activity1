package com.TransposeMatrix;

public class TransposeMatrix {

	public static void main(String[] args) {
		
			int original[][]= {{10,20,30},{40,50,60},{70,80,90}};
			int transpose[][]= new int[3][3];
			for(int k=0;k<3;k++)
			{
				for(int l=0;l<3;l++)
				{
					transpose[k][l]=original[l][k];
				}
			}
			System.out.println("The original matrix is:");
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					
				System.out.print(original[i][j]+" ");
			    }
			
			  System.out.println();
			}
			
			
			System.out.println("The Transpose of given matrix is:");	
			for(int m=0;m<3;m++)
			{
				for(int n=0;n<3;n++)
				{
					
				System.out.print(transpose[m][n]+" ");
			    }
			
			
				System.out.println();
		     }
	   
	    }
		
	}
	
	
		
	


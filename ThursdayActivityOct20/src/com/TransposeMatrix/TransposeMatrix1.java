package com.TransposeMatrix;

public class TransposeMatrix1 {
	public static void main(String[] args) {
		
		int original[][]= {{10,20,30},{40,50,60}};
		int transpose[][]= new int[3][3];
		//Creating a Transpose matrix
		for(int k=0;k<3;k++)
		{
			for(int l=0;l<2;l++)
			{
				transpose[k][l]=original[l][k];
			}
		}
		//Original matrix
		System.out.println("The original matrix is:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				
			System.out.print(original[i][j]+" ");
		    }
		
		  System.out.println();
		}
		
		//Transpose matrix
		System.out.println("The Transpose of given matrix is:");	
		for(int m=0;m<3;m++)
		{
			for(int n=0;n<2;n++)
			{
				
			System.out.print(transpose[m][n]+" ");
		    }
		
		
			System.out.println();
	     }
   
    }
	

}

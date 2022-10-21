package twoArraysEquality;
import java.util.*;

public class TestArraysEquality {
	public static boolean equal(int a1[],int a2[])
	{
		int n=a1.length;
		int m=a2.length;
		Arrays.sort(a1);
		Arrays.sort(a2);
		if(n!=m)
		{
			return false;
		}
		for(int i=0;i<n;i++)
		{
			if(a1[i]!=a2[i])
			{
               return false;		
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		int a1[]= new int[10];
		int[] a2=new int[10];
		System.out.println("Enter size of first array: ");
		Scanner sc=new Scanner(System.in);
		int size1=sc.nextInt();
		System.out.println("Enter elements of first array: ");
		for(int i=0;i<size1;i++)
		{
		a1[i]=sc.nextInt();
		}
		System.out.println("Enter size of second array: ");
		Scanner sc1=new Scanner(System.in);
		int size2=sc1.nextInt();
		System.out.println("Enter elements of second array: ");
		for(int i=0;i<size2;i++)
		{
		a2[i]=sc1.nextInt();
		}
		
			 if (equal(a1,a2))
			    {
				  System.out.println("The two arrays are equal");
			    }
			  else
			    {
				  System.out.println("The two arrays are not equal");
			
			    }
		 
		}
		
		 
    }


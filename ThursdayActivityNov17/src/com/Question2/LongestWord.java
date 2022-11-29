package com.Question2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWord {
	
	public String  Longestword()throws FileNotFoundException {
		String longestword="";
		String current;
		Scanner sc=new Scanner(new File("C:\\Sowmya\\input02.txt"));
		while( sc.hasNext()) 
		{
			current =sc.next();
			if(current.length() > longestword.length())
			{
				longestword = current;
			}
				System.out.println(longestword);
		
		return null;
		}
		return longestword;
		}

}

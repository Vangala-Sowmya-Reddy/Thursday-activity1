package com.Question1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class FruitBasket {
	
	public static void main(String[] args) {
		ArrayList<String> basket1= new ArrayList<String>();
		basket1.add("Blueberry");
		basket1.add("Rasberry");
		basket1.add("Avacado");
		basket1.add("Maskmelon");
		basket1.add("Dragon Fruit");
		basket1.add("JackFruit ");
		
		for(String s:basket1) {
			System.out.println(s);
		}
        System.out.println(basket1);
		
		ArrayList<String> basket2= new ArrayList<String>();
		basket2.add("Watermelon");
		basket2.add("Lichi");
		basket2.add("Blueberry");
		basket2.add("Rasberry");
		basket2.add("Avacado");
		basket2.add("Maskmelon");
		basket2.add("Apple");
		basket1.addAll(basket2);
		
		Iterator itr=basket2.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		basket1.remove(0);//to remove particular element by index
		basket1.removeAll(basket2);//to remove all elements in fruits1
	        Collections.replaceAll(basket2,"Watermelon","Apple");
		
		System.out.println(basket2);
		
		System.out.println(basket1);
		
		
		        

	}


}

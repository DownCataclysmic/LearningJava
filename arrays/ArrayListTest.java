package com.qa.arrays;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	 public static void main(String[] args){
	        List<String> sandwiches = new ArrayList<>(); //Produce a new ArrayList
	        sandwiches.add("Bread Sandwich"); //Add 
	        sandwiches.add("Tuna Mayo");
	        sandwiches.add("Chicken Mayo");
	        
	        System.out.println(sandwiches); //Print out contents of the ArrayList "sandwiches"
	        System.out.println(sandwiches.get(0)); //Print out the 1st element of the ArrayList
	        
	        sandwiches.set(0, "Cheese Ploughman"); //Change the 1st element to something different.
	        System.out.println(sandwiches.get(0));
	        
	        sandwiches.remove(0); //Remove the 1st element in the ArrayList
	        System.out.println(sandwiches);
	        
	        System.out.println(sandwiches.size()); //Print the size of the ArrayList
	        
	        sandwiches.clear(); //Clears the ArrayList
	        System.out.println(sandwiches);
	    }
}

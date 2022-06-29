package com.qa.arrays;
import java.util.Random;
import java.util.Arrays;

public class ArrayTasks {
	 public static int arr1[] = {23,64,30,12,36,89,24,77,45,11}; //Produce array

	    public static void task1() {
	        for(int i : arr1) {      
	            System.out.println("Number: " + i);             //For each element in array
	        }													//print it.
	    }
	    
	    public static void task2() {
	    	for (int i : arr1)
	    		System.out.println("Number: " + i*10);    		//For each element in array
	    }														//multiply it by 10 and 
	    														//and print it.
	    public static void task3() {
	    	for (int i = 0; i < arr1.length; i++)
	    		if (arr1[i] > 0) {
	    			int sum = 0, sum2 = 0, sum_f = 0;
	    			
	    			sum = sum + arr1[i] % 10;
	    			sum2 = arr1[i] / 10;
	    			sum_f = sum + sum2;
	    			
	    			System.out.print((i+1) + ".");
	    			System.out.println(" " + sum_f);
	    		}
	    }
	    
	    public static void task4() {
	    
	    	String onesWordArr[] = {"One", "Two", "Three", "Four", "Five", "Six", "Seven",
	    						"Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
	    						"Fourteen", "Fifteen", "Sixteen", "Seventeen",
	    						"Eighteen", "Nineteen"};
	    	
	    	String tensWordArr[] = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty",
	    						"Seventy", "Eighty", "Ninety"};
	    	
	    	int onesNumArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
	    	
	    	int tensNumArr[] = {20, 30, 40, 50, 60, 70, 80, 90};
	    	
	    	for (int i = 0; i < arr1.length; i++)
	    		if (arr1[i] > 0) {
	    			int num1 = 0, num2 = 0, numsum = 0;
	    			num1 = num1 + arr1[i] % 10;
	    			num2 = arr1[i] / 10;
	    			numsum = num1 + num2;
	    			
	    			if (arr1[i] >= 19) {
	    				num2 = num2*10;
	    				System.out.println(num2);
	    				System.out.println(" " + num1);
	    			} else {
	    			
	    			System.out.println(arr1[i]);	    			
	    			}
	    	
	    		}
	    	
	    }
	    
	    public static int find(int[] a, int target)
	    {
	        for (int i = 0; i < a.length; i++)
	        {
	            if (a[i] == target) {
	                return i;
	            }
	        }
	     
	        return -1;
	    }
	    public static void main(String[] args) {
	    	//task1();
	    	//task2();
	    	//task3();
	    	task4();
	    }
}
		
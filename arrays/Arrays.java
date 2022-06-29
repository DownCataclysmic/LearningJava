package com.qa.arrays;

public class Arrays {
	
	public static int[] ageArray1;                                //Empty one-dimensional array
	public static int[] ageArray2 = {23, 66, 7, 8, 53};           //Populated one-dimensional array
	public static int[] ageArray3 = new int[5];                   //Empty one-dimensional array with length specified
	public static int[][] ageArray4;							  //Empty two-dimensional array
	public static int[][] ageArray5 = {{1,2,3,4},{5,6,7,8},{9}};  //Populated two-dimensional array
	public static int[][] ageArray6 = new int[3][2];   		      //Empty multi-dimensional array with a length specified
	
	public static void arraymethod1() {
		for (int a:ageArray2) {
			System.out.println("Number: " + a);                   //Loop through an array: For Each Loop
		ageArray3[2] = 33;										  //Assign a value to the value at the second position of the array
		ageArray6[2][1] = 59;                                     //Assign a value to the position specified
		}
	}
	
	public static int votes[] = {1,1,2,3,4};
	
	public static void arraymethod2(int vote) {
		 System.out.println(vote);
	}
	
	public static void main(String[] args) {
		//arraymethod1();
		//for (int i = 0; i < votes.length; i++) {
			//arraymethod2(2);
		//}	
	}
}
package com.qa.java.arrays;

/*
 * Method to return the sum of the array elements
 */

public class SumArray {

	static int[] RandomArray = { 1, 6, 2, 8, 3, 9, 15, 0 };

	static int sum() {
		int sum = 0; // initialise sum
		int i;
		for (i = 0; i < RandomArray.length; i++) // Iterate elements and add them up
			sum += RandomArray[i];
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Sum of Random Array is " + sum()); // Method
		
		
//		Method to return smallest number
//		public class SmlTestArray {
//			
//			static int[] RandomArray = { 1, 6, 2, 8, 3, 9, 15, 0 };
//
//			static int SmallNumArray(int[] RandomArray) {
//				int ans = RandomArray[0];
//				for (int i = 1; i < RandomArray.length; i++) {
//					if (ans > RandomArray[i]) {
//						ans = RandomArray[i];
//					}
//				}
//				return ans;
	}
	
	
}

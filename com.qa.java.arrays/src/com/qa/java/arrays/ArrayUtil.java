package com.qa.java.arrays;

public class ArrayUtil {

	/*
	 * Method to calculate the male gender count
	 */
	int getMaleGenderCount(char[] genders) {
		int count = 0;
		for (char gender : genders) {
			if (gender == 'M')
				count++;
		}
		return count;

	}

	int getFemaleGenderCount(char[] genders) {
		int count = 0;
		for (char gender : genders) {
			if (gender == 'F')
				count++;
		}
		return count;
	}

	// How many employees are above the age of 25 and Male
	/*
	 * int employeeAgeAndGender(Employee[] emps, int age, char gender)
	 * 
	 */
	int employeeAgeAndGender(Employee[] emps, int age, char gender) {
		int count = 0;
		for (Employee emp : emps) {
			if (emp.age >= age && emp.gender == gender)
				count++;
		}
		return count;
	}

	int getSumOfArrayElements(int[] numbers) {

		// int[] numbers = {1,6,2,8,3,9,15,0};
		int sum = 0;

		for (int number : numbers) {
			sum += number;
		}
		return sum;

	}

	int getSmallestArrayElement(int[] numbers) {

		int smallNumber = numbers[0];
		for (int number : numbers) {
			if (number < smallNumber) {
				smallNumber = number;
			}
		}
		return smallNumber;

	}

	int getLargestArrayElement(int[] numbers) {

		int largeNumber = numbers[0];
		for (int number : numbers) {
			if (number > largeNumber) {
				largeNumber = number;
			}
		}
		return largeNumber;

	}

	int getEvenArrayElementCount(int[] numbers) {

		int count = 0;
		for (int number : numbers) {
			if (number % 2 == 0)
				count++;
		}
		return count;

		// Method to get the least price from Products Array
		
		

	}
}
package com.qa.java;

public class SwitchTest {

	public static void main(String[] args) {
		System.out.println("Menu");
		System.out.println("1. Add Product");
		System.out.println("2. Get Product");
		System.out.println("3. Update Product");
		System.out.println("4. Delete Product");
		System.out.println("Enter your input: ");
		int userchoice;
		userchoice = 1;
		System.out.println(userchoice);

		switch (userchoice) {
		case 1:
			System.out.println("Add product code");
			break;
		case 2:
			System.out.println("Get product code");
			break;
		case 3:
			System.out.println("Update product code");
			break;
		case 4:
			System.out.println("Delete product code");
			break;
		default:
			System.out.println("Invalid input, try again");
			break;
		}
	}

}

package com.qa.java.arrays;

public class Product {

	int id;
	String name;
	double price;
	String category;
	double rating;
	int discountPercentage;
	boolean isAvailable;

	final static String SHOP_NAME = "Shop_Name";
	final static String SHOP_CONTACT_NO = "07999999999";
	final static String SHOP_EMAIL = "seller@seller.com";

	// No arg constructor

	Product() {
		System.out.println("No data. Default NULL.");
		id = 1;
		name = "Apple";
		price = 3.25;
		category = "Fruits";
		rating = 3;
		discountPercentage = 10;
		isAvailable = true;

	}

	// arg constructor

	public Product(int id, String name, double price, String category, double rating, int discountPercentage, boolean isAvailable) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.rating = rating;
		this.discountPercentage = discountPercentage;
		this.isAvailable = isAvailable;

	}

	// method display product info

	void productInfo() {
		System.out.println("Product id: " + id);
		System.out.println("Product name: " + name);
		System.out.println("Product Catergory: " + category);
		System.out.println("Product rating: " + rating + "/5.0");
		System.out.println("Product in stock: " + isAvailable);
		System.out.println(discountPercentage + "% discount available");
		System.out.println("Originial Product Price: £" + price);
		System.out.println("Discounted Product Price: £"
				+ Math.round((price - (price * discountPercentage / 100)) * 100.00) / 100.00);
		System.out.println();
	}

	// method to display shop info
	static void sellerContactDetails() {
		System.out.println("Name is: " + SHOP_NAME);
		System.out.println("Phone number is: " + SHOP_CONTACT_NO);
		System.out.println("email is: " + SHOP_EMAIL);
		
		// method to display product with least price
	//void {
		
	//}
	}

}

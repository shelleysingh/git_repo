package com.qa.java.arrays;

public class ProductMain {

	public static void main(String[] args) {
		Product product1 = new Product();
		product1.id = 1;
		product1.name = "Apple";
		product1.price = 3.25;
		product1.category = "Fruits";
		product1.rating = 3;
		product1.discountPercentage = 10;
		product1.isAvailable = true;

		System.out.println("Product id: " + product1.id);
		System.out.println("Product name: " + product1.name);
		System.out.println("Product Catergory: " + product1.category);
		System.out.println("Product rating: " + product1.rating + "/5");
		System.out.println("Product in stock: " + product1.isAvailable);
		System.out.println(product1.discountPercentage + "% discount available");
		System.out.println("Originial Product Price: £" + product1.price);
		System.out.println("Discounted Product Price: £"
				+ (product1.price - (product1.price * product1.discountPercentage / 100)));
		System.out.println();

		Product product2 = new Product();
		product2.id = 2;
		product2.name = "Tomato";
		product2.price = 7.25;
		product2.category = "Fruits";
		product2.rating = 5;
		product2.discountPercentage = 8;
		product2.isAvailable = true;

		System.out.println("Product id: " + product2.id);
		System.out.println("Product name: " + product2.name);
		System.out.println("Product Catergory: " + product2.category);
		System.out.println("Product rating: " + product2.rating + "/5");
		System.out.println("Product in stock: " + product2.isAvailable);
		System.out.println(product2.discountPercentage + "% discount available");
		System.out.println("Originial Product Price: £" + product2.price);
		System.out.println("Discounted Product Price: £"
				+ (product2.price - (product2.price * product2.discountPercentage / 100)));
		System.out.println();

		Product product3 = new Product();
		product3.id = 3;
		product3.name = "Banana";
		product3.price = 1.25;
		product3.category = "Fruits";
		product3.rating = 4;
		product3.discountPercentage = 10;
		product3.isAvailable = true;

		System.out.println("Product id: " + product3.id);
		System.out.println("Product name: " + product3.name);
		System.out.println("Product Catergory: " + product3.category);
		System.out.println("Product rating: " + product3.rating + "/5");
		System.out.println("Product in stock: " + product3.isAvailable);
		System.out.println(product3.discountPercentage + "% discount available");
		System.out.println("Originial Product Price: £" + product3.price);
		System.out.println("Discounted Product Price: £"
				+ (product3.price - (product3.price * product3.discountPercentage / 100)));
		System.out.println();

		Product product4 = new Product();
		product4.id = 4;
		product4.name = "Strawberry";
		product4.price = 1.35;
		product4.category = "Fruits";
		product4.rating = 4;
		product4.discountPercentage = 10;
		product4.isAvailable = true;

		System.out.println("Product id: " + product4.id);
		System.out.println("Product name: " + product4.name);
		System.out.println("Product Catergory: " + product4.category);
		System.out.println("Product rating: " + product4.rating + "/5");
		System.out.println("Product in stock: " + product4.isAvailable);
		System.out.println(product4.discountPercentage + "% discount available");
		System.out.println("Originial Product Price: £" + product4.price);
		System.out.println("Discounted Product Price: £"
				+ (product4.price - (product4.price * product4.discountPercentage / 100)));
		System.out.println();

		Product product5 = new Product();
		product5.id = 5;
		product5.name = "Mango";
		product5.price = 1.45;
		product5.category = "Fruits";
		product5.rating = 4;
		product5.discountPercentage = 10;
		product5.isAvailable = true;

		System.out.println("Product id: " + product5.id);
		System.out.println("Product name: " + product5.name);
		System.out.println("Product Catergory: " + product5.category);
		System.out.println("Product rating: " + product5.rating + "/5");
		System.out.println("Product in stock: " + product5.isAvailable);
		System.out.println(product5.discountPercentage + "% discount available");
		System.out.println("Originial Product Price: £" + product5.price);
		System.out.println("Discounted Product Price: £"
				+ (product5.price - (product5.price * product5.discountPercentage / 100)));
		System.out.println();

	}

}

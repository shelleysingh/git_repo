package com.qa.java.arrays;

public class ArrayOfObjects {

	public static void main(String[] args) {
		/*
		 * Employee emp1; // a reference variable emp1 = new Employee(111, "emp1",
		 * "development", 24234.234, (byte) 25, 'M', 11.3f);
		 * 
		 * Employee emp2 = new Employee(222, "emp2", "QA", 456456.456, (byte) 30,
		 * 'F',22.3f);
		 */

		/*
		 * Array of objects int - 0 double - 0.0 char - space boolean - false object -
		 * null
		 * 
		 */
		
	
		Employee[] emps;
		emps = new Employee[5];
		// System.out.println(emps[0]);
		emps[0] = new Employee(111, "emp1", "development", 24234.234, (byte) 25, 'M', 11.3f);
		emps[1] = new Employee(222, "emp2", "development", 34234.234, (byte) 27, 'F', 15.3f);
		emps[2] = new Employee(333, "emp3", "QA", 44234.234, (byte) 28, 'F', 14.3f);
		emps[3] = new Employee(444, "emp4", "development", 54234.234, (byte) 26, 'M', 13.3f);
		emps[4] = new Employee(555, "emp5", "QA", 74234.234, (byte) 28, 'F', 16.3f);

		// print all the employee names
		for (Employee emp : emps) {
			// System.out.println(emp.name);
			emp.displayEmployeeInformation();
		}

		// Print The total Salaries of each employee
		// Emp1's total salary is :$5343.34
		for (Employee emp : emps) {
			System.out.println(emp.name + "'s total salary is : $" + emp.totalSalary());
		}
		ArrayUtil arrayUtil = new ArrayUtil();
		System.out.println(
				"Total Male Employee above Age : 30 years are : " + arrayUtil.employeeAgeAndGender(emps, 30, 'M'));
		
		// Product Array - YAY
		
		Product[] prod;
		prod = new Product[5];
		// System.out.println(prod[0]);
		prod[0] = new Product(111, "Apple", 1.45, "Fruits", 3, 10, true);
		prod[1] = new Product(222, "Tomato", 1.35, "Fruits", 3, 10, true);
		prod[2] = new Product(333, "Banana", 1.25, "Fruits", 2, 10, true);
		prod[3] = new Product(444, "Strawberry", 1.15, "Fruits", 10, 2, true);
		prod[4] = new Product(555, "Mango", 1.55, "Fruits", 1, 10, true);
		
		
		

	}

}

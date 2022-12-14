package com.qa.java.arrays;

public class Employee {
	// State ( data )
	// instance variables
	int id;
	String name;
	String department;
	double salary;
	float incrementPercentage;
	byte age;
	char gender;

	public Employee(int id, String name, String department, double salary, byte age, char gender,
			float incrementPercentage) {
		// System.out.println("Employee(arg) constructor is called...");
		this.id = id; // this refers to the current instance (object)
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.age = age;
		this.gender = gender;
		this.incrementPercentage = incrementPercentage;
	}

	// method
	/*
	 * Display employee information
	 */
	// instance method
	void displayEmployeeInformation() {
		System.out.println("-----------------------------------");
		System.out.println("id: " + id);
		System.out.println("name:" + name);
		System.out.println("department:" + department);
		System.out.println("gender:" + gender);
		System.out.println("salary:" + salary);
		System.out.println("age:" + age);
		System.out.println("-----------------------------------");
	}

	/*
	 * Calculate Incremented Salary of an employee
	 */

	double incrementedSalary() {
		return (salary * incrementPercentage / 100);
	}

	/*
	 * Calculate the total salary after the increment
	 */

	double totalSalary() {
		return salary + incrementedSalary();
	}

}

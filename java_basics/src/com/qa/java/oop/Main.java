package com.qa.java.oop;

public class Main {

	public static void main(String[] args) {
		
		
		int x = 100;
		x = 500;

		// Static data
		
		System.out.println("Company Name : " + Employee.COMPANY_NAME);
		System.out.println("Company Revenue : " + Employee.COMPANY_REVENUE);
		
		Employee.companyInformation();
		
		
		
		//Creating objects for my Employee class
		
		
	

		Employee emp1; // a reference variable
		emp1 = new Employee(111, "emp1", "development", 24234.234, (byte) 25, 'M', 11.3f); // an employee object is created
		System.out.println(emp1.name + "'s company name : " + Employee.COMPANY_NAME);
		
		//emp1.COMPANY_NAME = "QA Software Solutions"; Not allowed since COMPANY_NAME is final
		/*
		 * System.out.println("id: " + emp1.id); System.out.println("name:" +
		 * emp1.name); System.out.println("department:" + emp1.department);
		 * System.out.println("gender:" + emp1.gender); System.out.println("salary:" +
		 * emp1.salary); System.out.println("age:" + emp1.age);
		 */
		
		emp1.displayEmployeeInformation();
		double incrementedSalary = emp1.incrementedSalary();
		System.out.println(incrementedSalary);
		
		System.out.println(emp1.name + "'s total Salary is : " + emp1.totalSalary());

		/*
		 * employee.id = 111; employee.name = "emp1"; employee.department =
		 * "development"; employee.gender = 'M'; employee.salary = 46564.45;
		 * employee.age = 25;
		 */

		/*
		 * System.out.println("id: "+ employee.id); System.out.println("name:"
		 * +employee.name); System.out.println("department:" +employee.department);
		 * System.out.println("gender:" + employee.gender); System.out.println("salary:"
		 * + employee.salary); System.out.println("age:" + employee.age);
		 */

		Employee emp2 = new Employee(222, "emp2", "QA", 456456.456, (byte) 30, 'F',22.3f);
		System.out.println(emp2.name + "'s company name is : " + Employee.COMPANY_NAME);
		/*
		 * employee2.id = 222; employee2.name = "emp2"; employee2.department = "QA";
		 * employee2.gender = 'F'; employee2.salary = 56564.45; employee2.age = 26;
		 */

		/*
		 * System.out.println("id: " + emp2.id); System.out.println("name:" +
		 * emp2.name); System.out.println("department:" + emp2.department);
		 * System.out.println("gender:" + emp2.gender); System.out.println("salary:" +
		 * emp2.salary); System.out.println("age:" + emp2.age);
		 */
		emp2.displayEmployeeInformation();
		System.out.println(emp2.name +"'s incremented Salary : " + emp2.incrementedSalary());
		System.out.println(emp2.name + "'s total Salary is : " + emp2.totalSalary());
		//Employee emp3 = new Employee();
		
		
		
		
		
//		Employee employee; // a reference variable
//		employee = new Employee(); // an employee object is created
//		System.out.println("id: " + employee.id);
//		System.out.println("name:" + employee.name);
//		System.out.println("department:" + employee.department);
//		System.out.println("gender:" + employee.gender);
//		System.out.println("salary:" + employee.salary);
//		System.out.println("age:" + employee.age);
//
//		employee.id = 111;
//		employee.name = "emp1";
//		employee.department = "development";
//		employee.gender = 'M';
//		employee.salary = 46564.45;
//		employee.age = 25;
//
//		System.out.println("id: " + employee.id);
//		System.out.println("name:" + employee.name);
//		System.out.println("department:" + employee.department);
//		System.out.println("gender:" + employee.gender);
//		System.out.println("salary:" + employee.salary);
//		System.out.println("age:" + employee.age);
//
//		Employee employee2 = new Employee();
//		employee2.id = 222;
//		employee2.name = "emp2";
//		employee2.department = "QA";
//		employee2.gender = 'F';
//		employee2.salary = 56564.45;
//		employee2.age = 26;
//
//		System.out.println("id: " + employee2.id);
//		System.out.println("name:" + employee2.name);
//		System.out.println("department:" + employee2.department);
//		System.out.println("gender:" + employee2.gender);
//		System.out.println("salary:" + employee2.salary);
//		System.out.println("age:" + employee2.age);

	}

}

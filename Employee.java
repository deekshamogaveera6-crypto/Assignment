package com.acharya.classes;

public class Employee {

	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	public void getSalary() {
		System.out.println("The salary is : " + salary);
	}

	public void getName() {
		System.out.println("The name is : " + name);
	}

	public static void main(String args[]) {
		
		Employee emp = new Employee(12, "Acharya", 323245.00);
		System.out.println("Employee id is :" + emp.id);
		System.out.println("Employee salary:"+emp.salary);
		emp.getName();

		Employee emp1 = new Employee(14, "Kumar", 234232.00);
		System.out.println("Employee id is :" + emp1.id);
		System.out.println("Employee salary:"+emp1.salary);
		emp1.getName();

		Employee emp2 = new Employee(24, "raj", 4232.00);
		System.out.println("Employee id is :" + emp2.id);
		System.out.println("Employee salary:"+emp2.salary);
		emp2.getName();

	}

}

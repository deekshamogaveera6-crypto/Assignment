package com.acharya.classes;

import java.util.Scanner;

public class Students {

	int id;
	String name;
	double salary;

	public Students(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void getName() {
		System.out.println("The name is " + name);
	}

	public void getSalary() {
		System.out.println("The name is " + salary);
	}

	public static void main(String[] args) {

		Students student[] = new Students[4];

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < student.length; i++) {
			System.out.println("Enter the details of " + (i + 1) + " student");
			System.out.println("Enter student" + (i + 1) + " id");
			int localid = scan.nextInt();
			System.out.println("Enter student" + (i + 1) + " name");
			String localname = scan.next();
			System.out.println("Enter student" + (i + 1) + " salary");
			double localsalary = scan.nextDouble();

			student[i] = new Students(localid, localname, localsalary);
		}

		for (int i = 0; i < student.length; i++) {
			System.out.println("The id is " + student[i].id);
			System.out.println("The name is " + student[i].name);

			System.out.println("The id is " + student[i].salary);

		}
	}

}

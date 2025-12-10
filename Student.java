package com.acharya.classes;

public class Student {
	int id;
	String name;
	String lname;
	double fees;

	public Student(int id, String name, String lname, double fees) {
		this.id = id;
		this.name = name;
		this.lname = lname;
		this.fees = fees;
	}

	public void getfees() {
		System.out.println("the fees:" + fees);
	}

	public void getName() {
		System.out.println("the name:" +name + " " + lname);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student(123, "Deeksha", "kgh", 10000.00);
		System.out.println("Student id:" + std.id);
		std.getName();
		std.getfees();
		

		Student std1 = new Student(124, "rita", "mgh", 12000.00);
		System.out.println("Student id:" + std1.id);
		std1.getName();
		std1.getfees();
		

		Student std2 = new Student(125, "rima", "ljh", 18000.00);
		System.out.println("Student id:" + std2.id);
		std2.getName();
		std2.getfees();
		

		Student std3 = new Student(126, "savi", "rin", 14000.00);
		System.out.println("Student id:" + std3.id);
		std3.getName();
		std3.getfees();
		
	}
}

package com.sk.com;

public class Employee extends Person {
	
	
	private String company;
	private double salary;
	
	
	public Employee(String name, Adhar adhar, String address, String company, double salary) {
		super(name, adhar, address);
		this.company = company;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return super.toString()+"Employee:  [company=" + company + ", salary=" + salary + "]";

	}
	
	
	
	
	
	

}

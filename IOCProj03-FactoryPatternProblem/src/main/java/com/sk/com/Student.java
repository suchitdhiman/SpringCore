package com.sk.com;

public class Student extends Person{
	
	private int rollNo;
	private String course;
	
	
	public Student(String name, Adhar adhar, String address, int rollNo, String course) {
		super(name, adhar, address);
		System.out.println("Student.Student()");
		this.rollNo = rollNo;
		this.course = course;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", course=" + course + "]";
	}
	
	
	
	
	
	
	

}

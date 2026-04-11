package com.sk.com;

public class Adhar {
	
	private long adharNo;
	private int age;
	private long mNumber;
	
	
	//constructor
	public Adhar(long adharNo, int age, long mNumber) {
		//super();
		System.out.println("Adhar.Adhar()");
		this.adharNo = adharNo;
		this.age = age;
		this.mNumber = mNumber;
	}


	@Override
	public String toString() {
		return "Adhar [adharNo=" + adharNo + ", age=" + age + ", mNumber=" + mNumber + "]";
	}
	
	
	
	

}

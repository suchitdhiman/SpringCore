package com.sk.com;

public class Customer extends Person {
	

	private int customerId;
	private int billNumber;
	
	
	public Customer(String name, Adhar adhar, String address, int customerId, int billNumber) {
		super(name, adhar, address);
		
		System.out.println("Customer.Customer()");
		this.customerId = customerId;
		this.billNumber = billNumber;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", billNumber=" + billNumber + "]";
	}
	
	
	
	
	
	
	

}

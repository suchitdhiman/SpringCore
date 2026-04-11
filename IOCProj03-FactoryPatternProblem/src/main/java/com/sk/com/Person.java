package com.sk.com;

public abstract class Person {
	
	private String name;
	private Adhar adhar;
	private String address;
	
	
	public Person(String name, Adhar adhar, String address) {
		//super();
		System.out.println("Person.Person()");
		this.name = name;
		this.adhar = adhar;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", adhar=" + adhar + ", address=" + address + "]";
	}
	
	
	
	
	
	
	

}

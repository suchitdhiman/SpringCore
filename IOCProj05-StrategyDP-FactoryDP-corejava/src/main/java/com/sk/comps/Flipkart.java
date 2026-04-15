package com.sk.comps;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	
	Courier courier;

	public Flipkart() {
		System.out.println("Flipkart.Flipkart()");
		
	}
	
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier= courier;
	}
	
	public String shopping(String items[], double prices[] ) {
		
		System.out.println("Flipkart.shoppinh()");
		
		double billAmount=0.0;
		for(double p:prices) {
			billAmount += p;
					}
		
		int id = new Random().nextInt(1000000);
		
		String msg = courier.deliver(id);
		
		return Arrays.toString(items)+" are purchased having bill amount of ₹"+billAmount+" == IN"+msg;
		
		
		
		
	}
	
	
	
	

}

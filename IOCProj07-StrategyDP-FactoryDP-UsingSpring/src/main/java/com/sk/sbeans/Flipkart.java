package com.sk.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("fkt")
public final class Flipkart {
	@Autowired
	Courier courier;

	public Flipkart() {
		System.out.println("Flipkart.Flipkart()");

	}


	public String shopping(String items[], double prices[]) {

		System.out.println("Flipkart.shoppinh()");

		double billAmount = 0.0;
		for (double p : prices) {
			billAmount += p;
		}

		int id = new Random().nextInt(1000000);

		String msg = courier.deliver(id);

		return Arrays.toString(items) + " are purchased having bill amount of ₹" + billAmount + " == IN" + msg;

	}

}

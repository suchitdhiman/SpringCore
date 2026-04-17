package com.sk.factory;

import com.sk.comps.BlueDart;
import com.sk.comps.Courier;
import com.sk.comps.DTDC;
import com.sk.comps.Flipkart;

public class FlipkartFactory {

	public static Flipkart getInstance(String courierType) {

		// create dependant class obj
		Courier courier = null;
		if (courierType.equalsIgnoreCase("dtdc")) {
			courier = new DTDC();
		} else if (courierType.equalsIgnoreCase("blueDart")) {
			courier = new BlueDart();
		} else {
			throw new IllegalArgumentException("invalid courier type");
		}

		// create target calss obj
		Flipkart flipkart = new Flipkart();

		// assign dep class obj to target
		flipkart.setCourier(courier);
		return flipkart;

	}

}

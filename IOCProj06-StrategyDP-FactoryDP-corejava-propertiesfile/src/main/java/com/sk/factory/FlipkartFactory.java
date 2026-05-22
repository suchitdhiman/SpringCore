package com.sk.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.sk.comps.Courier;
import com.sk.comps.Flipkart;

public class FlipkartFactory {
	public static Properties properties;

	static {
		System.out.println("FlipkartFactory.enclosing_method()");
		try {
			InputStream ips = new FileInputStream("src/main/java/com/sk/props/info.properties");
			properties = new Properties();
			properties.load(ips);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public static Flipkart getInstance() {
		System.out.println("FlipkartFactory.getInstance()");

		// get dependant class name

		String courierClassName = properties.getProperty("courier.classname");
		Courier courier = null;
		try {

			// load the dependant class
			Class cl = Class.forName(courierClassName);

			// create the obj of dependent class
			//courier = (Courier) cl.newInstance();
			Constructor<Courier> cons[] = cl.getDeclaredConstructors();
			courier = cons[0].newInstance();

		} catch (Exception e) {
			e.printStackTrace();
		}

		// create target calss obj
		Flipkart flipkart = new Flipkart();

		// assign dep class obj to target
		flipkart.setCourier(courier);
		return flipkart;

	}

}

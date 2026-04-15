package com.sk.client;

import com.sk.comps.Flipkart;
import com.sk.factory.FlipkartFactory;

public class StrategyPattern {
	
	public static void main(String[] args) {
		//get Target class obj(Flipkart class obj) from Factory
		
		Flipkart flipkart = FlipkartFactory.getInstance("dtdc");
		String resultMsg = flipkart.shopping(new String[] {"candle", "soap"},
												new double[] {122.0,175.7});
		
		System.out.println(resultMsg);
		
	}

}

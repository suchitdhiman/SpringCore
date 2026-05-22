package com.sk.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;


import com.sk.sbeans.Flipkart;

public class StrategyPattern {
	
	public static void main(String[] args) {
		//get Target class obj(Flipkart class obj) from Factory
		
		FileSystemXmlApplicationContext filexml = new FileSystemXmlApplicationContext("src/main/java/com/sk/cfgs/applicationcontext.xml");
		Flipkart flpkt = (Flipkart)filexml.getBean("fkt");
		
		
		String resultMsg = flpkt.shopping(new String[] {"candle", "soap"},
												new double[] {127.0,175.7});
		
		System.out.println(resultMsg);
		
	}

}

package com.sk.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sk.sbeans.WishMessageGenerator;

public class DependancyInjectionTest {

	public static void main(String[] args) {
		
		
		//create the IOC Container
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/sk/cfgs/applicationContext.xml");
		
		//get target spring bean class obj from the IOC container
		
		Object obj = ctx.getBean("wmg");
		
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		
		//invoke the b.method
		String result = generator.generateWishMessage("suchit");
		System.out.println("Result:: "+result);
		
		//close the IOC Container
		ctx.close();
	}//main

}//class

package com.sk.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	
	private LocalDateTime dateTime;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}
	
	//setter method for setter injection
	@Autowired
	public void setDateTime(LocalDateTime dateTime) {
		System.out.println("WishMessageGenerator.setDateTime()");
		this.dateTime = dateTime;
		
	}
	
	//b.method
	public String generateWishMessage(String user) {
		
		System.out.println("WishMessageGenerator.generateWishMessage()");
		
		//get current hour of the day
		int hour = dateTime.getHour();
		
		if(hour < 12)
			return "\"Good Morning\" "+user+" ji";
		else if(hour < 16)
			return "\"Good Afternoon\""+user+" ji";
		else if(hour<20)
			return "Good Evening "+user+" ji";
		else
			return "Good Night "+user+" ji";
		
	}
	
	
}

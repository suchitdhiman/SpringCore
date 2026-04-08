package com.sk.sbeans;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	
	private LocalDateTime dateTime;
	
	private Date date;
	
	
	//arbitary method injection
	@Autowired
	public void dateinjection(Date date) {
		System.out.println("dateInjection working");
		this.date = date;
	}
	
	
	//arbitary method injection
	@Autowired
	public void dateTimeinjection(LocalDateTime dateTime) {
		System.out.println("localdatetime injection is working");
		this.dateTime = dateTime;
	}
	
	
//	//constructor injection
//	@Autowired
//	public WishMessageGenerator(LocalDateTime dateTime, Date date) {
//		System.out.println("WishMessageGenerator.WishMessageGenerator()");
//		this.dateTime = dateTime;
//		this.date = date;
//	}
	
	
	
//	//setter method for setter injection
//	@Autowired
//	public void setDateTime(LocalDateTime dateTime) {
//		System.out.println("WishMessageGenerator.setDateTime()");
//		this.dateTime = dateTime;
//		
//	}
	
	//b.method
	public String generateWishMessage(String user) {
		
		System.out.println("WishMessageGenerator.generateWishMessage()");
		
		System.out.println("Today date is :"+date);
		
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

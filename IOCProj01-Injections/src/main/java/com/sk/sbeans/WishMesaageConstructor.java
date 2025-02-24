package com.sk.sbeans;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmc")
public class WishMesaageConstructor {
	
	private Date date;
	
	@Autowired
	public WishMesaageConstructor(Date date) {
		System.out.println("WishMesaageConstructor-1 param constructor");
		this.date = date;
		}
	
	//method
	public void findDay(String  user) {
	System.out.println("this day is: "+date+" "+user);
	}
}

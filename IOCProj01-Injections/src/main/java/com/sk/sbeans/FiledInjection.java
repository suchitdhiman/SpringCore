package com.sk.sbeans;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("fi")
public class FiledInjection {
	
	@Autowired
	LocalDateTime localDateTime;
	@Autowired
	Date date;
	
	public String morningMessage(String user) {
		int currentHour = localDateTime.getHour();
		System.out.println("Today Date is: "+currentHour+" of the date: "+date+" "+user);
		if(currentHour < 12) {
			return "Good Morning! "+user;
			
		}
		else {
			return "Good Day! "+user;
		}
		
	}
	
	

}

package com.sk.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenrator {

	// has a property
	private LocalDateTime localdatetime;
	
	

	/**
	 * @param localdatetime
	 */
	public WishMessageGenrator() {

		System.out.println("WishMessageGenrator: 0-param constructor");
	}

	/**
	 * @param localdatetime the localdatetime to set
	 */
	@Autowired
	public void setLocaldatetime(LocalDateTime localdatetime) {
		System.out.println("WishMessageGenrator.setLocaldatetime()");
		this.localdatetime = localdatetime;
	}

	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenrator.generateWishMessage()");

		// get Cureent hour of the day

		int hour = localdatetime.getHour();

		if (hour < 12)
			return "Good Morning:" + user;
		else if (hour < 16)
			return "Good AfterNoon:" + user;
		else if (hour < 20)
			return "Good Evening:" + user;
		else
			return "Good Night:" + user;
	}

}// class

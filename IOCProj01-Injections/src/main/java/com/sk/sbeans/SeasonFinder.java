package com.sk.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("seas")
public class SeasonFinder {

	// Has a property
	private LocalDate localDate;

	/*
	 * @param LocalDate
	 */
	public SeasonFinder() {
		System.out.println("SeasonFinder.SeasonFinder()");
	}

	/*
	 * LocalDate the localdate to set
	 */
	@Autowired
	public void setLocalDate(LocalDate localDate) {
		System.out.println("SeasonFinder.setLocalDate()");
		this.localDate = localDate;
	}

	public String generateSeaon(String user) {

		/*
		 * Get current Month of the day
		 */
		int month = localDate.getMonthValue();

		if (month < 4) {
			return "Winter season " + user;
		} else if (month < 7) {
			return "Summar Season " + user;
		} else if (month < 11) {
			return "Rainy Seaon " + user;
		} else {
			return "Winter " + user;
		}

	}

}

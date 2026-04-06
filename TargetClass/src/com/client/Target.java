package com.client;
import java.time.LocalDateTime;

import com.sbeans.*;

public class Target {

	public static void main(String[] args) {
		
				WishMessageGenerator generator = new WishMessageGenerator();
				//get target spring bean class obj from the IOC container
				
				
				LocalDateTime dateTime = LocalDateTime.now();
				generator.setDateTime(dateTime);
				
				
				//invoke the b.method
				String result = generator.generateWishMessage("suchit");
				System.out.println("Result:: "+result);

	}

}

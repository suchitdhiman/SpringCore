package com.sk.client;



import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sk.sbeans.FiledInjection;
import com.sk.sbeans.SeasonFinder;
import com.sk.sbeans.WishMesaageConstructor;
import com.sk.sbeans.WishMessageGenrator;

public class DependencyInjectionTest {
    public static void main(String[] args) {
    	try {
        // Create the IOC container
        FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/sk/cfgs/applicationContext.xml");

        //get target spring bean class obj from the IOC container
        Object obj = ctx.getBean("wmg");
        Object obj1 = ctx.getBean("seas");
        Object obj2 = ctx.getBean("wmc");
        Object obj3 = ctx.getBean("fi");
        
        // Get target bean
        WishMessageGenrator generator = (WishMessageGenrator)obj;
        
        SeasonFinder seasonFinder = (SeasonFinder)obj1;
        
        WishMesaageConstructor wishMessageConstructor = (WishMesaageConstructor)obj2;
        
        FiledInjection fieldInjection = (FiledInjection)obj3;

        // Invoke the method
        String result = generator.generateWishMessage("Suchit");
        System.out.println("Result: " + result);
        
        //invoke season method
        String currentSeason = seasonFinder.generateSeaon("kk");
        System.out.println(currentSeason);
        
        //invoke the constructor method
        System.out.println("Constructor Message: ");
        wishMessageConstructor.findDay("suchit kumar");
        
        //invoke the method
        System.out.println(fieldInjection.morningMessage("suchit"));
        
        if(ctx !=null) {
        	// Close context (not needed for ClassPathXmlApplicationContext)
            ctx.close();
        }
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
        
        
    }
}

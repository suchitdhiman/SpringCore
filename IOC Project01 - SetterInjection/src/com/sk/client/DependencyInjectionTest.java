package com.sk.client;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sk.sbeans.SeasonFinder;
import com.sk.sbeans.WishMessageGenrator;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create the IOC container
        FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/sk/cfgs/applicationContext.xml");

        //get target spring bean class obj from the IOC container
        Object obj = ctx.getBean("wmg");
        Object obj1 = ctx.getBean("seas");
        // Get target bean
        WishMessageGenrator generator = (WishMessageGenrator)obj;
        
        SeasonFinder seasonFinder = (SeasonFinder)obj1;

        // Invoke the method
        String result = generator.generateWishMessage("Suchit");
        System.out.println("Result: " + result);
        
        //invoke season method
        String currentSeason = seasonFinder.generateSeaon("kk");
        System.out.println(currentSeason);
        
        

        // Close context (not needed for ClassPathXmlApplicationContext)
        ctx.close();
    }
}

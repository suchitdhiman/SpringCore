package com.sk.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sk.sbeans.WishMessageGenrator;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create the IOC container
        FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/sk/cfgs/applicationContext.xml");

        //get target spring bean class obj from the IOC container
        Object obj = ctx.getBean("wmg");
        // Get target bean
        WishMessageGenrator generator = (WishMessageGenrator)obj;

        // Invoke the method
        String result = generator.generateWishMessage("Suchit");
        System.out.println("Result: " + result);

        // Close context (not needed for ClassPathXmlApplicationContext)
        ctx.close();
    }
}

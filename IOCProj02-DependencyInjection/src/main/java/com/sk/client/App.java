package com.sk.client;


import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sk.sbeans.SeasonWisher;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //create IOC conatainer
        FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/sk/cfgs/applicationcontext.xml");
        
        //get target spring bean class obj from the IOC container
        Object obj = ctx.getBean("swm");
        
        //season
        SeasonWisher season = (SeasonWisher)obj;
        
        System.out.println( season.generateSeaon("suchit"));
        
        ctx.close();
        
        
        
    }
}

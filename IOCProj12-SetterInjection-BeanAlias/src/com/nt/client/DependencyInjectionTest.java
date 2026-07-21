//DependencyInjectionTest.java
package com.nt.client;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		//create the IOC container
		/*ileSystemXmlApplicationContext ctx=
				    new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");*/
		
		  //ClassPathXmlApplicationContext  ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

		ClassPathXmlApplicationContext  ctx=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		

	/*	//get  target  Spring bean class obj from  the IOC container 
		    Object obj=ctx.getBean("wmg");
		      //String result=obj.generateWishMessage("Raja");  // using super class ref we can not call direct methods of sub class,  if needed go for typecasting
             //WishMessageGenerator  generator=(WishMessageGenerator)obj;
		    Date  generator=(Date)obj; */
		
		  WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		  WishMessageGenerator generator1=ctx.getBean("w1",WishMessageGenerator.class);
		      
             
			//invoke the b.methodS
			String result=generator.generateWishMessage("raja");
			 System.out.println("Result ::"+result);
			 
			 System.out.println("____________________________________");
			 LocalDateTime  dt1=ctx.getBean("ldt",LocalDateTime.class);
			 LocalDateTime  dt2=ctx.getBean("l1",LocalDateTime.class);
			 LocalDateTime  dt3=ctx.getBean("l2",LocalDateTime.class);
			 System.out.println(dt1+"  "+dt2+"   "+dt3);
			 
			 LocalDateTime  dt4=ctx.getBean("l3",LocalDateTime.class);
			 LocalDateTime  dt5=ctx.getBean("l4",LocalDateTime.class);
			 System.out.println(dt4+"  "+dt5);
			 
			 LocalDateTime  dt6=ctx.getBean("lt",LocalDateTime.class);
			 System.out.println(dt6);
			 
             
             
             //close the IOC container
             ctx.close();
	}//main

}//class

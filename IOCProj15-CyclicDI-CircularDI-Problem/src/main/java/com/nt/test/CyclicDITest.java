//ClientApp
package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.A;

public class CyclicDITest {

	public static void main(String[] args) {
	     //create the IOC container
		  ClassPathXmlApplicationContext ctx=
				    new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		  //get  Spring bean class object
		  A  a1=ctx.getBean("a1",A.class);
		  
		  System.out.println(a1);
		  
		  //close the container
		   ctx.close();
	}

}

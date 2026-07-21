//ClientApp
package com.nt.client;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.nt.sbeans.Flipkart;
import com.nt.ston.Printer;
public class SpringBeanScopesTest {

	public static void main(String[] args) {
		
	
		   ClassPathXmlApplicationContext  ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		///get Target spring bean class obj ref
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		Flipkart fpkt1=ctx.getBean("fpkt",Flipkart.class);
		 //invoke the b.method
		 String resultMsg=fpkt.shopping(new String[] {"kurtha-piajama","pathaani","atthar","sweets"},
				                                                      new double[] {2000.0,300.0,1000.0,600.0});
		 System.out.println(resultMsg);
		 System.out.println(fpkt.hashCode()+"   "+fpkt1.hashCode());
		 System.out.println("fpkt==fpk1?"+(fpkt==fpkt1));
		 System.out.println("_______________________________");
		 Printer  o1=ctx.getBean("p1",Printer.class);
		 Printer  o2=ctx.getBean("p1",Printer.class);
		 System.out.println(o1.hashCode()+"  "+o2.hashCode());
		 System.out.println("o1==o2?"+(o1==o2));
		 
		 //close the cotnainer
		 ctx.close();
		}//main

}//class

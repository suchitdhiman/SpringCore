//ClientApp
package com.nt.client;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.nt.sbeans.Flipkart;
public class StrategyDP_FactoryDPTest {

	public static void main(String[] args) {
		
		//create  IOC container
		/*FileSystemXmlApplicationContext ctx=
				new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml"); */
		
		/*FileSystemXmlApplicationContext ctx=new
				            FileSystemXmlApplicationContext("E:\\Worskpaces\\Spring\\NTSPBMS716\\IOCProj07-StrategyDP-FactoryDP-UsingSpring\\src\\main\\java\\com\\nt\\cfgs\\applicationContext.xml");
		
		*/
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
		 
		 //close the cotnainer
		 ctx.close();
		}//main

}//class

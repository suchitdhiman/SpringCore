package com.sk.test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sk.controller.CustomerOperationsController;
import com.sk.model.Customer;

public class RealTimeTest{
    public static void main(String[] args) {


    		Scanner scanner = new Scanner(System.in);

    		System.out.println("Enter Customer name:: ");
    		String cname = scanner.nextLine();

    		System.out.println("Enter the address of the customer:: ");
    		String caddrs = scanner.nextLine();

    		System.out.println("Enter the bill Amount:: ");
    		double billAmount = scanner.nextDouble();

    		System.out.println("Enter the discount Percentage::");
    		double discount = scanner.nextDouble();

    		//crate the customer object
    		Customer customer = new Customer();
    		customer.setCname(cname); customer.setCaddrs(caddrs);
    		customer.setBillAmount(billAmount); customer.setDiscount(discount);

    		//create IOC container
    		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/sk/cfgs/applicationContext.xml");

    		// Get Controller class object from the IOC Container

    		CustomerOperationsController controller = ctx.getBean("custController", CustomerOperationsController.class);

    		//invoke business method
    		try {
				String resultMsg = controller.processCustomer(customer);
				System.out.println(resultMsg);
			} catch (Exception e) {
				e.printStackTrace();
			}

    		ctx.close();
    		scanner.close();
    }
}

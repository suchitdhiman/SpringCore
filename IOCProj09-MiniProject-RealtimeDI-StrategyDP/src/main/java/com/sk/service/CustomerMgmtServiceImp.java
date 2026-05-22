package com.sk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.dao.ICustomerDAO;
import com.sk.model.Customer;


@Service("custService")
public class CustomerMgmtServiceImp implements ICustomerMgmtService {

	@Autowired
	private ICustomerDAO custmoerDAO;


	@Override
	public String registerCustomer(Customer customer) throws Exception {

		//calculate discount, final amount
		double discountAmount = (customer.getBillAmount()*(customer.getDiscount()/100.0));
		double finalAmount = customer.getBillAmount()-discountAmount;

		//set finalamount to model class object
		customer.setFinalAmount(finalAmount);

		//use DAO
		int count  = custmoerDAO.insert(customer);
		return count==0?"customer registration failed":"Customer Registered having billAmount::"+customer.getBillAmount()+"Discount Amount::"+discountAmount+"Final Amount::"+finalAmount;


	}

}

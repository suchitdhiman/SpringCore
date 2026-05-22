package com.sk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sk.model.Customer;
import com.sk.service.ICustomerMgmtService;

@Controller("custController")
public class CustomerOperationsController {
	
	@Autowired
	private ICustomerMgmtService custService;

	public String processCustomer(Customer customer) throws Exception {

		String result = custService.registerCustomer(customer);
		return result;
	}


	}


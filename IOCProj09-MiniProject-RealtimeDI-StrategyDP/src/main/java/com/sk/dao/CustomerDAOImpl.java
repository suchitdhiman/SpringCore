package com.sk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sk.model.Customer;


@Repository("custDAO")
public class CustomerDAOImpl implements ICustomerDAO {
	private static final String CUSTOMER_INFO_INSERT_QUERY =
			"INSERT INTO SPRING_CUSTOMER_INFO VALUES(CNO_SEQ1.NEXTVAL,?,?,?,?,?)";

	@Autowired
	private DataSource dataSource;

	@Override
	public int insert(Customer customer) throws Exception {
		int count = 0;
		try (Connection connection = dataSource.getConnection();){
			PreparedStatement preparedStatement = connection.prepareStatement(CUSTOMER_INFO_INSERT_QUERY);

			//Set values to query params
			preparedStatement.setString(1, customer.getCname());
			preparedStatement.setString(2, customer.getCaddrs());
			preparedStatement.setDouble(3, customer.getBillAmount());
			preparedStatement.setDouble(4, customer.getDiscount());
			preparedStatement.setDouble(5, customer.getFinalAmount());

			//execute the sql query
			count = preparedStatement.executeUpdate();

		} catch (SQLException se){
			se.printStackTrace();
			throw se;
		} catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return count;
	}//insert

}//class

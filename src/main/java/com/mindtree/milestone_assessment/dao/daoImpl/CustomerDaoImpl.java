package com.mindtree.milestone_assessment.dao.daoImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mindtree.milestone_assessment.dao.CustomerDao;
import com.mindtree.milestone_assessment.entity.Customer;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public void getInsertedtoDB(Customer customer) {
		
		Connection con=null;
		PreparedStatement stmt=null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String SQLquery = "INSERT INTO customer(customer_id,name,address) VALUES(?,?,?);";
			stmt = con.prepareStatement(SQLquery);
			
			stmt.setInt(1, customer.getCustomer_id());
			stmt.setString(2, customer.getName());
			stmt.setString(3, customer.getAddress());
			
			stmt.executeUpdate();
			System.out.println("Inserted into DB...");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			if(stmt !=null)
				stmt.close();
				con.close();
		}catch(Exception ae) {
			ae.printStackTrace();
		}

	}

	@Override
	public List<Customer> viewTable() {
		List<Customer> customers = new ArrayList<>();
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Connected database successfully...");
			
			
			String sqlQuery = "SELECT * FROM customer";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sqlQuery);
			
			while (rs.next()) {
				Customer customer = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3));
				customers.add(customer);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			if(stmt !=null)
				stmt.close();
				con.close();
		}catch(Exception ae) {
			ae.printStackTrace();
		}
		return customers;
	}

}

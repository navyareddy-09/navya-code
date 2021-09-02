package com.mindtree.milestone_assessment.service;

import java.util.List;

import com.mindtree.milestone_assessment.entity.Customer;

public interface CustomerService {
	final String url = "jdbc:mysql://localhost:3306/milestoneassessment"; 
	final String user = "root";
	final String password = "root";
	
	void getInsertedtoDB(Customer customer);
	
	List<Customer> viewTable();
}

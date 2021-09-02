package com.mindtree.milestone_assessment.service.serviceImpl;

import java.util.List;

import com.mindtree.milestone_assessment.dao.CustomerDao;
import com.mindtree.milestone_assessment.dao.daoImpl.CustomerDaoImpl;
import com.mindtree.milestone_assessment.entity.Customer;
import com.mindtree.milestone_assessment.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	
	CustomerDao daoConnection = new CustomerDaoImpl();

	@Override
	public void getInsertedtoDB(Customer customer) {
		daoConnection.getInsertedtoDB(customer);

	}

	@Override
	public List<Customer> viewTable() {
		return daoConnection.viewTable();
	}

}

package com.mindtree.milestone_assessment.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mindtree.milestone_assessment.entity.Customer;
import com.mindtree.milestone_assessment.service.CustomerService;
import com.mindtree.milestone_assessment.service.serviceImpl.CustomerServiceImpl;

public class App 
{
	
	private static CustomerService serviceConnection = new CustomerServiceImpl();
	private static Scanner scanner = new Scanner(System.in);
	
	private static int customer_id;
	private static String name;
	private static String address;
	public static void main(String[] args) {
		
		Customer customer = getValues();
		serviceConnection.getInsertedtoDB(customer);
		
		List<Customer> insertedStudents = new ArrayList<>();
		insertedStudents = serviceConnection.viewTable();
		displayStudentsFromDB(insertedStudents);
	}
	
	private static void displayStudentsFromDB(List<Customer> insertedStudents) {
		for (Customer customer : insertedStudents) {
			System.out.println(customer.getCustomer_id() + " | " + customer.getName() + " | " + customer.getAddress());
		}

	}
	
		
	public static Customer getValues() {
		
		System.out.println("Enter the customerId:");
		customer_id=scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Enter the name of the customert:");
		name=scanner.nextLine();
		
		System.out.println("Enter the address of the customer:");
		address=scanner.nextLine();
		
		Customer newCustomer = new Customer(customer_id, name, address);
		return newCustomer;
	}
}

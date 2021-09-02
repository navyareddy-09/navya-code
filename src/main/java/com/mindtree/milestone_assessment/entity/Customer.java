package com.mindtree.milestone_assessment.entity;

public class Customer {
	int customer_id;
	String name;
	String address;
	public Customer(int customer_id, String name, String address) {
		super();
		this.customer_id = customer_id;
		this.name = name;
		this.address = address;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", name=" + name + ", address=" + address + "]";
	}
	

}

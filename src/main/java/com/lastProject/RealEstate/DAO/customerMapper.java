package com.lastProject.RealEstate.DAO;

import java.util.ArrayList;

import com.lastProject.RealEstate.VO.Customer;

public interface CustomerMapper {

    public int signup(Customer c);
	
	public ArrayList<Customer> checkid();
	
	public Customer login(Customer c);
	
}

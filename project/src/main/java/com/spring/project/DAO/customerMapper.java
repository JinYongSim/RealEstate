package com.spring.project.DAO;

import java.util.ArrayList;

import com.spring.project.VO.customer;

public interface customerMapper {

	public int signup(customer c);
	
	public ArrayList<customer> checkid();
	
	public customer login(customer c);
}

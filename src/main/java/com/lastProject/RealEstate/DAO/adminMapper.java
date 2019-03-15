package com.lastProject.RealEstate.DAO;

import java.util.ArrayList;

import com.lastProject.RealEstate.VO.Admin;
import com.lastProject.RealEstate.VO.Customer;

public interface AdminMapper {

	public Admin adminLogin(Admin admin); //로그인
	
	public ArrayList<Customer> customerGenderStats();
}

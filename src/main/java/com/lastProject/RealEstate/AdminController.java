package com.lastProject.RealEstate;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lastProject.RealEstate.DAO.AdminDAO;import com.lastProject.RealEstate.DAO.AdminMapper;
import com.lastProject.RealEstate.VO.Admin;
import com.lastProject.RealEstate.VO.Customer;

@Controller
public class AdminController {

	@Autowired
	AdminDAO dao;
	
	//관리자 페이지 이동 루트
	@RequestMapping(value = "/adminPage", method = RequestMethod.GET)
	public String adminManagementMainPage() {
		return "admin/adminMain";
	}
	
	//관리자 로그인
	@RequestMapping(value = "/adminLogin", method = RequestMethod.POST)
	public @ResponseBody String adminLogin(Admin admin, HttpSession httpSession) {
		Admin result = new Admin();
		try {
			result = dao.adminLogin(admin);
			if (result == null) {
				return "error";
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		httpSession.setAttribute("admin", result);
		return "success";
	}
	
	//관리자 로그아웃
	@RequestMapping(value = "/adminLogout", method = RequestMethod.GET)
	public String adminLogout(HttpSession httpSession) {
		httpSession.invalidate();
		return "admin/adminMain";
	}
	
	@RequestMapping(value = "customerGenderStats", method = RequestMethod.POST)
	public @ResponseBody ArrayList<Customer> customerGenderStats() {
		ArrayList<Customer> cList = new ArrayList<Customer>();
		try {
			cList = dao.customerGenderStats();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cList;
	}
	
	@RequestMapping(value = "/customerAgeStats", method = RequestMethod.POST)
	public @ResponseBody ArrayList<Customer> customerAgeStats(){
		ArrayList<Customer> cList = new ArrayList<Customer>();
		try {
			cList = dao.customerAgeStats();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cList;
	}
}

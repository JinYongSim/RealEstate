package com.spring.project.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.project.DAO.customerDAO;
import com.spring.project.VO.customer;

@Controller
public class customerController {

	@Autowired
	
	customerDAO dao;
	
	@RequestMapping(value="/signupgo",method=RequestMethod.GET)
	public String signupgo() {
		
		return "signupgo";
	}
	@RequestMapping(value="/signup",method=RequestMethod.POST)
	public String signup(customer c,Model model,HttpSession session) {
		
		dao.signup(c);
		
		return "home";
	}
	
	@RequestMapping(value="/idcheck",method=RequestMethod.GET)
	public @ResponseBody String idcheck(String customer_id) {
		ArrayList<customer> list=dao.checkid();	
		for (customer customer : list) {
			
			if (customer_id.equals(customer.getCustomer_id())) {
				return "duplicated";
			}
		
		}
		return "success";
	}
	
	/*@RequestMapping(value="/phonecheck",method=RequestMethod.GET)
	public @ResponseBody String phonecheck(String customer_phone) {
		ArrayList<customer> list=dao.checkid();	
		for (customer customer : list) {
			
			if (customer_phone.equals(customer.getCustomer_phone())) {
				return "duplicated";
			}
		
		}
		return "success";
	}*/
	
	/*@RequestMapping(value="/emailcheck",method=RequestMethod.GET)
	public @ResponseBody String emailcheck(String customer_email) {
		ArrayList<customer> list=dao.checkid();	
		for (customer customer : list) {
			
			if (customer_email.equals(customer.getCustomer_email())) {
				return "duplicated";
			}
		
		}
		return "success";
	}*/
	
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)	
	public String login(customer c,Model model,HttpSession session)
	{
		
		customer cu=dao.login(c);
		
		if(cu!=null) {
			session.setAttribute("loginId",c);
		}else {
			model.addAttribute("message","아이디나 비밀번호가 틀렸습니다");
			return "logingo";
		}
	    
		return "home";
	}
	@RequestMapping(value="/logingo",method=RequestMethod.GET)
	public String logingo() {
		return "logingo";
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "home";
	}
	
	
}
	

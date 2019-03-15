package com.lastProject.RealEstate;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lastProject.RealEstate.DAO.CustomerDAO;
import com.lastProject.RealEstate.VO.Customer;




@Controller
public class CustomerController {

     @Autowired
	 CustomerDAO dao;
     
     @RequestMapping(value="/signupgo",method=RequestMethod.GET)
 	public String signupgo() {
 		
 		return "customer/signupgo";
 	}
 	@RequestMapping(value="/signup",method=RequestMethod.POST)
 	public String signup(Customer c,Model model,HttpSession session) {
 		
 		dao.signup(c);
 		
 		return "home";
 	}
 	
 	@RequestMapping(value="/idcheck",method=RequestMethod.GET)
 	public @ResponseBody String idcheck(String customer_id) {
 		ArrayList<Customer> list=dao.checkid();	
 		for (Customer customer : list) {
 			
 			if (customer_id.equals(customer.getCustomer_ID())) {
 				return "duplicated";
 			}
 		
 		}
 		return "success";
 	}
	
 	@RequestMapping(value="/login",method=RequestMethod.POST)	
	public String login(Customer c,Model model,HttpSession session)
	{
		
		Customer cu=dao.login(c);
		
		if(cu!=null) {
			session.setAttribute("loginId",c);
		}else {
			model.addAttribute("message","아이디나 비밀번호가 틀렸습니다");
			return "customer/logingo";
		}
	    
		return "home";
	}
	@RequestMapping(value="/logingo",method=RequestMethod.GET)
	public String logingo() {
		return "customer/logingo";
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "home";
	}
}

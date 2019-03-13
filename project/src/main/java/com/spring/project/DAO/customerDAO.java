package com.spring.project.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.project.VO.customer;

@Repository
public class customerDAO {

	@Autowired
	SqlSession session;
	
	public int signup(customer c) {
		int result=0;
		customerMapper mapper=session.getMapper(customerMapper.class);
		try {
		   result=mapper.signup(c);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
		return result;
	}
	
	public ArrayList<customer> checkid() {
		ArrayList<customer> cu=null;
		customerMapper mapper=session.getMapper(customerMapper.class);
		try {
			cu=mapper.checkid();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			// TODO: handle exception
		}
		return cu;
	}
	public customer login(customer c) {
		customer cu=null;
		customerMapper mapper=session.getMapper(customerMapper.class);
		try {
			cu=mapper.login(c);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		return cu;
	}
	
}

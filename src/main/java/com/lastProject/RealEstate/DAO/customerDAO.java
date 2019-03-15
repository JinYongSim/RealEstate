package com.lastProject.RealEstate.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lastProject.RealEstate.VO.Customer;

@Repository
public class CustomerDAO {

	
	@Autowired
	SqlSession session;
	//회원가입
	public int signup(Customer c) {
		int result=0;
		CustomerMapper mapper=session.getMapper(CustomerMapper.class);
		try {
		   result=mapper.signup(c);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
		return result;
	}
	//아이디 중복체크
	public ArrayList<Customer> checkid() {
		ArrayList<Customer> cu=null;
		CustomerMapper mapper=session.getMapper(CustomerMapper.class);
		try {
			cu=mapper.checkid();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			// TODO: handle exception
		}
		return cu;
	}
	//로그인
	public Customer login(Customer c) {
		Customer cu=null;
		CustomerMapper mapper=session.getMapper(CustomerMapper.class);
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

package com.lastProject.RealEstate.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lastProject.RealEstate.VO.Admin;
import com.lastProject.RealEstate.VO.Customer;

@Repository
public class AdminDAO {
	@Autowired
	SqlSession sqlSession;
	
	//관리자 로그인
	public Admin adminLogin(Admin admin) {
		AdminMapper map = sqlSession.getMapper(AdminMapper.class);
		Admin result = new Admin();
		try {
			result = map.adminLogin(admin);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	//고객 성별 통계 출력
	public ArrayList<Customer> customerGenderStats() {
		AdminMapper map = sqlSession.getMapper(AdminMapper.class);
		ArrayList<Customer> cList = new ArrayList<Customer>();
		try {
			cList = map.customerGenderStats();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cList;
	}
	
	//고객 나이대 통계 출력
	public ArrayList<Customer> customerAgeStats(){
		AdminMapper map = sqlSession.getMapper(AdminMapper.class);
		ArrayList<Customer> cList = new ArrayList<Customer>();
		try {
			cList = map.customerAgeStats();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cList;
	}
}

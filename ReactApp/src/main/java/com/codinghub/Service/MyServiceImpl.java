package com.codinghub.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codinghub.Repository.Dao;
@Service
public class MyServiceImpl implements MyService {
	@Autowired
	Dao dao;
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return dao.add(num1,num2);
	}
	@Override
	public String m1() {
		// TODO Auto-generated method stub
		return dao.m1();
	}

}

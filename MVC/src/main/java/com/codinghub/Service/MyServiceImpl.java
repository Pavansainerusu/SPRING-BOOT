package com.codinghub.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codinghub.Repository.Dao;

@Service
public class MyServiceImpl implements MyService{
	@Autowired
	Dao dao;
	public String m1() {
		return Dao.m1();
	}
}

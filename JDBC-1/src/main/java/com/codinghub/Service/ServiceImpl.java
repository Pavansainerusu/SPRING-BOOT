package com.codinghub.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.codinghub.Repository.Dao;

public class ServiceImpl implements ServiceInterface {
	@Autowired
	Dao dao;
	@Override
	public String insert() {
		// TODO Auto-generated method stub
		return Dao.insert();
	}

}

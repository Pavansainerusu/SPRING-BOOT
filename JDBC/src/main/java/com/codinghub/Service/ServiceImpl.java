package com.codinghub.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codinghub.Repository.Dao;
@Service
public class ServiceImpl implements ServiceInterface{
	@Autowired
	Dao dao;
	public String insert() {
		// TODO Auto-generated method stub
		return Dao.insert();
	}
	@Override
	public String update() {
		// TODO Auto-generated method stub
		return "Provide details to update";
	}
	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		 return Dao.delete(id);
	}
	@Override
	public String update(int id, String name, int mobiel, String email) {
		// TODO Auto-generated method stub
		 return Dao.update(id, name, mobiel, email);
	}
	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

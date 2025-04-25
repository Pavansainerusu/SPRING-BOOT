package com.institutions.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.institutions.Model.Institute;
import com.institutions.Repository.InstituteRepository;

@Service
public class InstituteImpl implements InstituteInterface{
	@Autowired
	private InstituteRepository dao;

	@Override
	public String save(Institute institute) {
		// TODO Auto-generated method stub
		Institute i1= dao.save(institute);
		return i1 +"SAVED SUCCESFULLY";
	}

	@Override
	public List<Institute> findAll() 
	{
		return dao.findAll();
	}

	@Override
	public String findById(Long roll) {
		Optional<Institute> optional=dao.findById(roll);
		if(optional.isPresent())
		{
			Institute institute=optional.get();
			return "institute with roll " +roll+"found\n"+institute; 
		}
		else
		{
			return "institute with roll " +roll+" not found";
		}
	}

	@Override
	public Institute findByName(String student_name) {
	return dao.findByName(student_name);	
	}


}

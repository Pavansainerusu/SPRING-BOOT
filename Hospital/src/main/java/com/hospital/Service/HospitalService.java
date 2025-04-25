package com.hospital.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.hospital.Model.Hospital;
import com.hospital.Repository.hospitalDao;

@Service
public class HospitalService implements HospitalInterface 
{
	@Autowired
	hospitalDao dao;
	@Override
	public Hospital save(Hospital hospital) 
	{
		return dao.save(hospital);
	}

	@Override
	public Optional<Hospital> findById(long id) 
	{
		return dao.findById(id);
	}
	@Override
	public List<Hospital> findAll() 
	{
		return (List<Hospital>)dao.findAll(Sort.by("id"));
	}

	@Override
	public String update(long id, Hospital hospital)
	{
		Optional<Hospital> optional=dao.findById(id);
		if(optional.isPresent())
		{
			Hospital hospital1=optional.get();
			hospital1.setId(hospital.getId());
			hospital1.setName(hospital.getName());
			hospital1.setHospital(hospital.getHospital());
			hospital1.setLocation(hospital.getLocation());
			return dao.save(hospital)+"UPDATED SUCESSFULLY";
		}
		else
		{
			return "USER WITH ID= "+ id	 +"DOES NOT EXIST";
		}
		
	}
	@Override
	public List<Hospital> myPagmentation() {
		PageRequest pagerequest=PageRequest.of(1,3);
		Page<Hospital> page=dao.findAll(pagerequest);
		return page.toList();
	}


	
}

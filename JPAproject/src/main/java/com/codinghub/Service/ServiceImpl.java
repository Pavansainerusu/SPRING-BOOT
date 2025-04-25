package com.codinghub.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codinghub.Model.Student;
import com.codinghub.Repository.Dao;
@Service
public class ServiceImpl implements ServiceInterface {
	@Autowired
	private Dao dao;
	@Override
	public String save(Student student) 
	{
		Student s1=dao.save(student);
		return s1+ "\n INSERTED SUCCESFULLY";
	}
	@Override
	public List<Student> findAll() 
	{
		
		return (List<Student>) dao.findAll();
	}
	@Override
	public String deleteById(int roll) 
	{
		Optional<Student> opt=dao.findById(roll);
		if(opt.isPresent()) {
			Student student=opt.get();
			dao.delete(student);
			return "USER WITH ID = "+ roll +" DELETED SUCCEFULLY";
		}
		else
		return "USER WITH ID =" + roll +" NOT SUCCESFULLY";
	}

	@Override
	public Optional<Student> findById(int roll) 
	{
		Optional<Student> optional=dao.findById(roll);
		if(optional.isPresent())
		{
			return optional;
		}
		else
		{
			return Optional.empty();
		}
	}
	@Override
	public String update(int roll, Student student) 
	{
		Optional<Student> optional=dao.findById(roll);
		if(optional.isPresent())
		{
			Student student1=optional.get();
			student1.setName(student.getName());
			student1.setEmail(student.getEmail());
			student1.setSection(student.getSection());
			return dao.save(student1)+"UPDATED SUCESSFULLY";
		}
		else
		{
			return "USER WITH ID= "+ roll +"DOES NOT EXIST";
		}
		
	}
	@Override
	public String deleteall() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

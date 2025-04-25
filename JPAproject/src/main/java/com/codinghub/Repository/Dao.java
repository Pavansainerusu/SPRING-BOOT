package com.codinghub.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codinghub.Model.Student;

@Repository
public interface Dao extends  CrudRepository<Student,Integer>{

	



}

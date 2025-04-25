package com.institutions.Service;

import java.util.List;


import com.institutions.Model.Institute;

public interface InstituteInterface {

	String save(Institute institute);

	List<Institute> findAll();

	String findById(Long roll);

	Institute findByName(String student_name);




}

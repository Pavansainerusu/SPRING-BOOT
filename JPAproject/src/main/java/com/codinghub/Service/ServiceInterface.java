package com.codinghub.Service;

import java.util.List;
import java.util.Optional;

import com.codinghub.Model.Student;

public interface ServiceInterface {

	String save(Student student);

	List<Student> findAll();

	String deleteById(int roll);

	Optional<Student> findById(int roll);

	String update(int roll, Student student);

	String deleteall();

	


}

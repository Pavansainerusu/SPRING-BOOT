package com.institutions.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.institutions.Model.Institute;
@Repository
public interface InstituteRepository extends JpaRepository<Institute,Long>
{

	Institute findByName(String student_name);
	
}

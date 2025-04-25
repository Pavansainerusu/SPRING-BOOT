package com.hospital.Service;

import java.util.List;
import java.util.Optional;

import com.hospital.Model.Hospital;

public interface HospitalInterface {

	Optional<Hospital> findById(long id);

	

	List<Hospital> findAll();


	Hospital save(Hospital hospital);



	String update(long id, Hospital hospital);



	List<Hospital> myPagmentation();

	

	

}

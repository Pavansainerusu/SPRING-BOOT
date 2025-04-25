package com.hospital.Repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.Model.Hospital;

public interface hospitalDao extends JpaRepository<Hospital,Long> {

	

}

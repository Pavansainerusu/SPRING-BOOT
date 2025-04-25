package com.hospital.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.Model.Hospital;
import com.hospital.Service.HospitalInterface;

@RestController
@RequestMapping("/hosp")
public class hospitalController 
{
	@Autowired
	private HospitalInterface service;
	@PostMapping("/save")
	public Hospital save(@RequestBody Hospital hospital)
	{
		return service.save(hospital);
	}
	@GetMapping("/{id}")
	public Optional<Hospital> findById(@PathVariable long id) 
	{
		return service.findById(id);
	}
	@GetMapping("/")
	public List<Hospital> findAll(){
		return service.findAll();
	}
	@PutMapping("/{id}")
	public String update(@PathVariable long id,@RequestBody Hospital hospital)
	{
		return service.update(id,hospital);
		
	}
	@GetMapping("/pagination")
	public List<Hospital> myPagmentation(){
		return service.myPagmentation();
		
	}

}

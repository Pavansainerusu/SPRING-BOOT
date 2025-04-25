package com.institutions.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.institutions.Model.Institute;
import com.institutions.Service.InstituteInterface;

@RestController
@RequestMapping("/inst")
public class InstituteController {
	@Autowired
	private InstituteInterface service;
	@PostMapping("/")
	public String save(@RequestBody Institute institute)
	{
		return  service.save(institute);
	}
	@GetMapping("/")
	public List<Institute> findAll()
	{
		return service.findAll();
	}
	@GetMapping("/{roll}")
	public String findById(@PathVariable Long roll)
	{
		return service.findById(roll);
	}
	@GetMapping("/name/{name}")
	public Institute findByname(@PathVariable String student_name)
	{
		return service.findByName(student_name);
	}
}

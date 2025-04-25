package com.codinghub.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codinghub.Service.MyService;

@RestController
@RequestMapping("/m2")
@CrossOrigin(origins = "http://localhost:3000") 
public class MyController {
	@Autowired
	private MyService Service;
	@GetMapping("/m1")
	public String m1() {
		return Service.m1();
	}
	@GetMapping("/add/{num1}/{num2}")
	public int add(@PathVariable int num1,@PathVariable int num2) 
	{
		return Service.add(num1,num2);
	}
}

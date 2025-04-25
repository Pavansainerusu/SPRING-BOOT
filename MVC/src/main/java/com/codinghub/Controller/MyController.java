package com.codinghub.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codinghub.Service.MyService;

@RestController
public class MyController {
	@Autowired
	MyService Service;
	@GetMapping("/")
	public String m1() {
		return Service.m1();
	}

}

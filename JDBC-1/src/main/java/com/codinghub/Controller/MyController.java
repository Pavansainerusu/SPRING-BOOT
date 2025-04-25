package com.codinghub.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codinghub.Service.ServiceInterface;

@RestController
@RequestMapping("/")
public class MyController {
	@Autowired
	private ServiceInterface Service;
	@PostMapping("/insert")
	public String insert() {
		return Service.insert();
		
	}
}

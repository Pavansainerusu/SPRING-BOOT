package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.DataFile;
import com.example.Service.ServiceInterface;

@RestController
@RequestMapping("/free")
public class MyController {
@Autowired
private ServiceInterface serviceInterface;

@PostMapping("/")
public String save(@RequestBody DataFile datafile)
{
	return  serviceInterface.save(datafile);
}
}

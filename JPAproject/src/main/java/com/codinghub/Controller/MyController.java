package com.codinghub.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codinghub.Model.Student;
import com.codinghub.Service.ServiceInterface;

@RestController
@RequestMapping("/student")
public class MyController {
@Autowired
private ServiceInterface service;
@PostMapping("/")
public String save(@RequestBody Student student)
{
	return service.save(student);
}
@GetMapping("/")
public List<Student> findAll()
{
	return service.findAll();
}
@GetMapping("/{roll}")
public Optional<Student> findById(@PathVariable int roll) {
	return service.findById(roll);
}
@PutMapping("/{roll}")
public String update(@PathVariable int roll,@RequestBody Student student)
{
	return service.update(roll,student);
	
}
@DeleteMapping("/")
public String deleteall() {
	return service.deleteall();
	
}
@DeleteMapping("/{roll}")
public String deleteById(@PathVariable int roll) {
	return service.deleteById(roll);
}

}

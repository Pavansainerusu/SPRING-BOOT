package com.codinghub.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codinghub.Service.ServiceInterface;

@RestController
@RequestMapping("/table")
public class MyController {
@Autowired
private ServiceInterface Service;
@PostMapping("/insert")
public String save() {
	return Service.insert();
	
}
@PostMapping("/delete")
public String delete(@RequestParam int id) {
    return Service.delete(id);
}
@PostMapping("/update")
public String update(@RequestParam int id,
        @RequestParam String name,
        @RequestParam int mobiel,
        @RequestParam String email) {
	return Service.update(id, name, mobiel, email);
}
	

}

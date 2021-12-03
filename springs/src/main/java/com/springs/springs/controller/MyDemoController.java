package com.springs.springs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springs.springs.entity.Student;
import com.springs.springs.service.InfoService;

@RestController
public class MyDemoController {
	
@GetMapping("/home")
public void home() {
	
//	return "Tired Night";
	
}
@GetMapping("/h")
public Integer h() {
	return 3;
}
@Autowired
private InfoService ins;

@GetMapping("/info")
public List<Student> getDetails(){
	return this.ins.getInfo();
	
}
@GetMapping("/infoOne/{id}")
public Optional<Student> getDet(@PathVariable long id) {
	return this.ins.getInf(id);
}
@PostMapping("/info")
public Student insertDetails(@RequestBody Student e) {
	return this.ins.insertDet(e);
}

}


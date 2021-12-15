package com.springs.springs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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

@PostMapping("/infoOne/{id}")
public Student updateDetails(@RequestBody Student e) {
	return this.ins.updateDet(e);
}


@DeleteMapping("/infoOne/{id}")
public ResponseEntity<HttpStatus> deleteDetails(@PathVariable long id)
{
	try 
	{
		this.ins.deleteDet(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	catch(Exception e) 
	{
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}

}


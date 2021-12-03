package com.springs.springs.service;

import java.util.List;
import java.util.Optional;

//import org.springframework.web.bind.annotation.PathVariable;

import com.springs.springs.entity.Student;

public interface InfoService {
	
public List<Student> getInfo();

public Optional<Student> getInf(long id) ;

public Student insertDet(Student e);

public void deleteDet(long id);

}
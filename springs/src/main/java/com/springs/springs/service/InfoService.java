package com.springs.springs.service;

import java.util.List;
import java.util.Optional;

import com.springs.springs.entity.Student;

public interface InfoService {
	
public List<Student> getInfo();

public Optional<Student> getInf(long id) ;

public Student insertDet(Student e);


}
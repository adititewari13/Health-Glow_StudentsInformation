package com.springs.springs.service;

//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springs.springs.dao.DaoStudent;
import com.springs.springs.entity.Student;

@Service
public class childInfoService implements InfoService {

//	List<Employee> l;
	@Autowired
	private DaoStudent d;
	
	
	
	
	public childInfoService() {
	}
	
	@Override
	public List<Student> getInfo() {
		// TODO Auto-generated method stub
//		return l;
//		return d.findAll();
		return d.findAll();
//		return null;
	}

	@Override
	public Optional<Student> getInf(long id) {
//		
//		
		return d.findById(id);

	}

	@Override
	public Student insertDet(Student e) {
		d.save(e);
		return e;
	}
	

}

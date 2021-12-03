package com.springs.springs.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springs.springs.entity.Student;

public interface DaoStudent extends MongoRepository<Student, Long> 
{

}

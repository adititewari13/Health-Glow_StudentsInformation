package com.springs.springs.entity;

import org.springframework.data.annotation.Id;

//import javax.persistence.Entity;

//import org.springframework.data.annotation.Id;

//import javax.persistence.Entity;
//import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

//@Entity
@Document
public class Student  {
@Id
 private long id;
 private String fname;
 private String lname;
 private String dob;
 private int age;
 private String stream;
 private String university;
 private String branch;
 private long cno;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getStream() {
	return stream;
}
public void setStream(String stream) {
	this.stream = stream;
}
public String getUniversity() {
	return university;
}
public void setUniversity(String university) {
	this.university = university;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public long getCno() {
	return cno;
}
public void setCno(long cno) {
	this.cno = cno;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(long id, String fname, String lname, String dob, int age, String stream, String university,
		String branch, long cno) {
	super();
	this.id = id;
	this.fname = fname;
	this.lname = lname;
	this.dob = dob;
	this.age = age;
	this.stream = stream;
	this.university = university;
	this.branch = branch;
	this.cno = cno;
}
@Override
public String toString() {
	return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", age=" + age + ", stream="
			+ stream + ", university=" + university + ", branch=" + branch + ", cno=" + cno + "]";
}

 
}

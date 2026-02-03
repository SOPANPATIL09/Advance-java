package com.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departments {
	
@Id	
@GeneratedValue (strategy=GenerationType.IDENTITY)
private  int id;
private String name;
@OneToMany   (mappedBy="departments")
private List<Student> student=new LinkedList();
public int getId() {
	return id;
}
public List<Student> getStudent() {
	return student;
}
public void setStudent(List<Student> student) {
	this.student = student;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Departments [id=" + id + ", name=" + name + "]";
}


	
}

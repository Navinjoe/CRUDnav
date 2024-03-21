package com.Basic.service;
import java.util.List;

import com.Basic.entity.Student;

public interface Servicein {
	
	List<Student>getAllstudents();
	
    Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
	
}

package com.Basic.service.studentimpl;

import java.util.List;


import org.springframework.stereotype.Service;
import com.Basic.entity.Student;
import com.Basic.repository.repository;
import com.Basic.service.Servicein;

@Service
public class studentimpl  implements Servicein{
	
	
    private repository rep;
    
    
    public studentimpl(repository rep) {
    	super();
    	this.rep=rep;	
    }
	
	@Override
	public List<Student> getAllstudents() {
		
		return rep.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return rep.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		
		return rep.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		
		return rep.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		rep.deleteById(id);
		
	}

}

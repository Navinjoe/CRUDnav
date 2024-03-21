package com.Basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Basic.entity.Student;
import com.Basic.service.Servicein;



@Controller
public class controller {
	
	private Servicein simpl;
	
	
	public controller (Servicein simpl) {
		super();
		this.simpl=simpl;
	}
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("sl", simpl.getAllstudents());
		return "sum";
	}
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "form";
	}
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		simpl.saveStudent(student);
		return "redirect:/students";
	}

	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", simpl.getStudentById(id));
		return "editstudent";
	}

	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student") Student student,
			Model model) {
		
		// get student from database by id
		Student existingStudent = simpl.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstname(student.getFirstname());
		existingStudent.setLastname(student.getLastname());
		existingStudent.setEmail(student.getEmail());
		
		// save updated student object
		simpl.updateStudent(existingStudent);
		return "redirect:/students";		
	}

	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		simpl.deleteStudentById(id);
		return "redirect:/students";
	}
	
	
}

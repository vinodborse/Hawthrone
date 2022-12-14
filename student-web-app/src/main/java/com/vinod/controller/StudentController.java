package com.vinod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vinod.model.Student;
import com.vinod.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService stdService;
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student std) {		
		Student data = stdService.addStudent(std);
		return data;
	}
	
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable("id") Long id) {
		Student std = stdService.getStudent(id);
		return std;
	}
}

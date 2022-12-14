package com.vinod.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinod.dao.StudentRepository;
import com.vinod.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository sr;
	
	public Student addStudent(Student std) {
		Student stdData = sr.save(std);
		
		return stdData;
	}
	
	public Student getStudent(long id) {
		Optional<Student> student = sr.findById(id);
		return student.get();
	}
}

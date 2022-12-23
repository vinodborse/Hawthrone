package com.vinod.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinod.dao.StudentRepository;
import com.vinod.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public String addStudent(Student student) {

		//....................
		
		Student std = studentRepository.save(student);
		
		return "Student " + std.getFirstName() + " has been added....!!";
	}

	public List<Student> getAllStudents() {
		
		List<Student> stds = (List<Student>) studentRepository.findAll();
		
		return stds;
	}

	public Student getStudent(Long rollNo) {
		Optional<Student> std = studentRepository.findById(rollNo);
		return std.isPresent()? std.get() : new Student();
	}

	public String deleteStudent(Long rollNo) {
		studentRepository.deleteById(rollNo);
		return "Student has been deleted...!!!";
		
		
	}
	
	
	
	
}

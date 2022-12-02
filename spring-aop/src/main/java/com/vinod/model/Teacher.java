package com.vinod.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
	
	@Autowired
	Student student;
	
	public void teacherMethod() {
		System.out.println("This is Teacher's Method");
		System.out.println("------------------------");
		student.studentMethod();
	}
}



/*We are in TS
This is Teacher's Method
*/
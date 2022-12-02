package com.vinod.modal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Teacher {
	
	@Autowired
	private Student student;

	@Autowired
	private Batch batch;
	
	public void msg(int batchId) {
		if (batchId == 1) {
			System.out.println("Hello from Teacher's class.. We are having " + batch.ui());
		} else {
			System.out.println("Hello from Teacher's class.. We are having " + batch.backend());			
		}

	}
}

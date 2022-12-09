package com.vinod.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vinod.model.Batch;

@RestController
public class BatchController {
	
	@PostMapping("/add-batch")
	public Batch addBatch(@RequestBody Batch bat) {
		// DB code
		
		return bat;
	}

}

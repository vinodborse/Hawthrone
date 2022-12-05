package com.vinod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@GetMapping("/std")
	public void welcome() {
		System.out.println("We are in TS....");
	}
	
	@GetMapping("/std-list")
	public ModelAndView listData() {

		ModelAndView mv = new ModelAndView();
		System.out.println("We have student list.....");
		
		mv.addObject("result", "Displaying the data , We have student list.....");
		mv.setViewName("display.jsp");
		
		return mv;
	}
	
	@GetMapping("/data")
	public void data() {
		System.out.println("We are going to fetch the data");
	}
	
	
}
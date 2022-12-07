package com.vinod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	@GetMapping("/user-msg/{username}/{mb}")
	public @ResponseBody String data(@PathVariable("username") String name,
										@PathVariable("mb") String mobile) {
		System.out.println("Welcome user....");
		return "Welcome " + name + ", your mobile no:- " + mobile + " ....";
	}
	
	@GetMapping("/msg")
	public @ResponseBody String msg(@RequestParam("umsg") String name,
									@RequestParam("mb") String mobile) {
		return "Welcome " + name + ", your mobile no:- " + mobile + " ....";
	}
	

	@DeleteMapping("/delete-user/{id}")
	public @ResponseBody String deleteUser(@PathVariable("id") int id) {
		//delete name from user where id = 4;
		
//		session.delete(id);
		return "user id = " + id + " has been deleted";
	}
	
	
}
/*
HTTP		SQL
-----		------
GET			SELECT
POST		INSERT/SAVE
PUT			UPDATE
PATCH		UPDATE
DELETE		DELETE



@PathVariable -> http://localhost:8080/spring-web-api-app/user-msg/Aliya
@RequestParam -> http://localhost:8080/spring-web-api-app/msg?umsg=Don
@RequestBody


http://localhost:8080/spring-web-api-app/user/{name}/company

http://localhost:8080/spring-web-api-app/user/7/company


http://localhost:8080/spring-web-api-app/user/company?name=vinod


*/
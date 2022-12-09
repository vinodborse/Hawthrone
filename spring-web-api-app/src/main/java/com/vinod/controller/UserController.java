package com.vinod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vinod.model.User;

//@Controller
@RestController //--> @Controller & @ResponseBody
public class UserController {

	@GetMapping("/user-msg/{username}/{mb}")
	public String data(@PathVariable("username") String name,
										@PathVariable("mb") String mobile) {
		System.out.println("Welcome user....");
		return "Welcome " + name + ", your mobile no:- " + mobile + " ....";
	}
	
	@GetMapping("/msg")
	public String msg(@RequestParam("umsg") String name,
									@RequestParam("mb") String mobile) {
		return "Welcome " + name + ", your mobile no:- " + mobile + " ....";
	}
	

	@DeleteMapping("/delete-user/{id}")
	public String deleteUser(@PathVariable("id") int id) {
		//delete name from user where id = 4;
		
//		session.delete(id);
		return "user id = " + id + " has been deleted";
	}
	
	
	@PostMapping("/add-user")
	public User addUser(@RequestBody User us) {

/*		User user = new User(us.getFirstName(), 
							  us.getLastName(), 
							  us.getCity(), 
							  us.getMobile(), 
							  us.getEmail());
		 session.save(user);
		 return user;
		 */
		//session.save(us);
		return us;
	}
	
	
	@GetMapping("/sample")
	private String sample() {
		return "Sample Method";
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


{
	fname = "Vinod",
	lname = "Borse",
	city = "Pune",
	mob = 1234,
	email = "v.b@g.c"
}


{
	"fname" : "Vinod",
	"lname" : "Borse",
	"city" : "Pune",
	"mob" : 1234,
	"email" : "v.b@g.c"

}

*/
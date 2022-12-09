package com.vinod.model;

public class User {

	private String firstName;
	private String lastName;
	private String city;
	private int mobile;
	private String email;
	
	
	public User() {}
	
	public User(String firstName, String lastName, String city, int mobile, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.mobile = mobile;
		this.email = email;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

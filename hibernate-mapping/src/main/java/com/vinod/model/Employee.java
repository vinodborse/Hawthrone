package com.vinod.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id
	private int id;
	private String firstName;
	private String lastName;
	
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name="m_id") private Mobile mobile;
	 * 
	 * public Mobile getMobile() { return mobile; } public void setMobile(Mobile
	 * mobile) { this.mobile = mobile; }
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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

	
}

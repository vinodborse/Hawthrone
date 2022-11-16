package com.vinod.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id
	private int id;
	private String firstName;
	private String lastName;

/*	
	@OneToMany(mappedBy = "emp")
	private List<Mobile> mobile = new ArrayList<Mobile>();
 
	public List<Mobile> getMobile() {
		return mobile;
	}
	public void setMobile(List<Mobile> mobile) {
		this.mobile = mobile;
	}
*/	
	
	@OneToMany
	@JoinTable(
				name = "emp_mob", 
				joinColumns = {@JoinColumn(name = "e_id")},
				inverseJoinColumns = {@JoinColumn(name = "m_id")}
			  )
	private List<Mobile> mobiles = new ArrayList<Mobile>();
	 
	public List<Mobile> getMobiles() {
		return mobiles;
	}
	public void setMobiles(List<Mobile> mobiles) {
		this.mobiles = mobiles;
	}
	
	
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

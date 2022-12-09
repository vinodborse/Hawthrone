package com.vinod.model;

public class Batch {
	
	private String name;
	private String type;
	private String time;
	private String teacher;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	public Batch(String name, String type, String time, String teacher) {
		super();
		this.name = name;
		this.type = type;
		this.time = time;
		this.teacher = teacher;
	}
	
	public Batch() {}

}

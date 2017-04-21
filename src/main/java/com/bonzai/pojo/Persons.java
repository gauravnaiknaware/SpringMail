package com.bonzai.pojo;

public class Persons {

	private long id;
	private String designation;
	private String firstname;
	private String lastname;
	private long salary;

	public Persons(long id, String des, String firstname, String lastname, long salary) {
		this.id = id;
		this.designation = des;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
}

package com.student.demo.model;

import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@javax.persistence.Entity
public class Student {
	String firstname;
	String lastname;
	String email;
	@Id
	int id;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@JsonIgnore
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", id=" + id + "]";
	}

}

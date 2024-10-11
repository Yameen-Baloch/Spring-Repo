package com.firstspringbootproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int id;
	

	private String emailAddress;

	
	private String first_name;

	private String last_name;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int id, String emailAddress, String first_name, String last_name) {
		super();
		this.id = id;
		this.emailAddress = emailAddress;
		this.first_name = first_name;
		this.last_name = last_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getemailAddress() {
		return emailAddress;
	}

	public void setemailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", email_address=" + emailAddress + ", first_name=" + first_name + ", last_name="
				+ last_name + "]";
	}
	
	


}

package com.gil.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
	
	

	public Customer(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	private long id;
	private String name;
	private String password;
	
	public Customer() {
	}
	
	public Customer(String name, String password) {
		this.name = name;
		this.password = password;
	}
	public Customer(long id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString(){
		return "ID: " + this.id + " Name: " + this.name + " Password: " + this.password;
	}
	
	

}

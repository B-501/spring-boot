package com.example.keystone;

public class User {
	private String password_expires_at;
	private Domain domain;
	private String id;
	private String name;
	
	public String getPassword_expires_at() {
		return password_expires_at;
	}
	
	public void setPassword_expires_at(String password_expires_at) {
		this.password_expires_at = password_expires_at;
	}
	
	public Domain getDomain() {
		return domain;
	}
	
	public void setDomain(Domain domain) {
		this.domain = domain;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}

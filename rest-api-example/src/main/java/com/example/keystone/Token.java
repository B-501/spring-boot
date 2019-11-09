package com.example.keystone;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Token {
	private String issued_at;
	private String[] audit_ids;
	private String[] methods;
	private String expires_at;
	
	private User user;
	
	public Token() {
		
	}
	
	public String getIssued_at() {
		return issued_at;
	}
	
	public void setIssued_at(String issued_at) {
		this.issued_at = issued_at;
	}
	
	public String[] getAudit_ids() {
		return audit_ids;
	}
	
	public void setAudit_ids(String[] audit_ids) {
		this.audit_ids = audit_ids;
	}
	
	public String[] getMethods() {
		return methods;
	}
	
	public void setMethods(String[] methods) {
		this.methods = methods;
	}
	
	public String getExpires_at() {
		return expires_at;
	}
	
	public void setExpires_at(String expires_at) {
		this.expires_at = expires_at;
	}
	
	public String getUser() {
		return expires_at;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "{\r\n" + 
				"    \"token\": {\r\n" + 
				"        \"issued_at\": \"2" + issued_at + "\",\r\n" + 
				"        \"audit_ids\": [\r\n" + 
				"            \"" + audit_ids[0] + "\"\r\n" + 
				"        ],\r\n" + 
				"        \"methods\": [\r\n" + 
				"            \"" + methods[0] + "\"\r\n" + 
				"        ],\r\n" + 
				"        \"expires_at\": \"" + expires_at + "\",\r\n" + 
				"        \"user\": {\r\n" + 
				"            \"password_expires_at\": " + user.getPassword_expires_at() + ",\r\n" + 
				"            \"domain\": {\r\n" + 
				"                \"id\": \"" + user.getDomain().getId() + "\",\r\n" + 
				"                \"name\": \"" + user.getDomain().getName() + "\"\r\n" + 
				"            },\r\n" + 
				"            \"id\": \"" + user.getId() + "\",\r\n" + 
				"            \"name\": \"" + user.getName() + "\"\r\n" + 
				"        }\r\n" + 
				"    }\r\n" + 
				"}";
	}
}

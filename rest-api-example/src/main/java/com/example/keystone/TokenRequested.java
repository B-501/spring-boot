package com.example.keystone;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TokenRequested {
	private String id;
	private String password;
	private String domain;
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getDomain() {
		return this.domain;
	}
	
	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Override
	public String toString() {
		return "{\r\n" + 
				"    \"auth\": {\r\n" + 
				"        \"identity\": {\r\n" + 
				"            \"methods\": [\r\n" + 
				"                \"password\"\r\n" + 
				"            ],\r\n" + 
				"            \"password\": {\r\n" + 
				"                \"user\": {\r\n" + 
				"                    \"name\": \"" + id + "\",\r\n" + 
				"                    \"domain\": {\r\n" + 
				"                        \"name\": \"" + domain + "\"\r\n" + 
				"                    },\r\n" + 
				"                    \"password\": \"" + password + "\"\r\n" + 
				"                }\r\n" + 
				"            }\r\n" + 
				"        }\r\n" + 
				"    }\r\n" + 
				"}";
	}
}

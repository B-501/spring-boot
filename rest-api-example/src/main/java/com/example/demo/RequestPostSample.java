package com.example.demo;

public class RequestPostSample {
	private String id;
	private String name;
	
	public RequestPostSample() {
		
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
	
	@Override
	public String toString() {
		return "Id = \"" + id + "\"\r\n" + "Name = \"" + name + "\"";
	}
}

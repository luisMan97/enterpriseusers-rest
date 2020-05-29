package com.example.demo;

public class ErrorMessage extends EmployeeResponse {
	
	private String message;
	
	public ErrorMessage(String message) {
		super();
		this.setMessage(message);
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

}

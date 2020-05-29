package com.example.demo;

public class Employee {
	
	private String name;
	private String lastname;
	private String documentType;
	private String document;
	private String birth;
	private String vinculation;
	private String position;
	private String salary;

	public Employee() {
		super();	
	}

	public Employee(String name, String lastname, String documentType, String document, String birth,
			String vinculation, String position, String salary) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.documentType = documentType;
		this.document = document;
		this.birth = birth;
		this.vinculation = vinculation;
		this.position = position;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getVinculation() {
		return vinculation;
	}

	public void setVinculation(String vinculation) {
		this.vinculation = vinculation;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

}

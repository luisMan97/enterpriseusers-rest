package com.example.demo;

/*import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter*/
public class EmployeeDate extends EmployeeResponse {
	
	private DetailDate age;
	private DetailDate vinculation;
	
	public EmployeeDate(DetailDate age, DetailDate vinculation) {
		super();
		this.setAge(age);
		this.setVinculation(vinculation);
	}

	public DetailDate getAge() {
		return age;
	}

	public void setAge(DetailDate age) {
		this.age = age;
	}

	public DetailDate getVinculation() {
		return vinculation;
	}

	public void setVinculation(DetailDate vinculation) {
		this.vinculation = vinculation;
	}

}

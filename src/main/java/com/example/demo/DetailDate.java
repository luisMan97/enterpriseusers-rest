package com.example.demo;

/*import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter*/
public class DetailDate {
	
	private int years;
	private int months;
	private int days;
	
	public DetailDate(int years, int months, int days) {
		this.setYears(years);
		this.setMonths(months);
		this.setDays(days);
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public int getMonths() {
		return months;
	}

	public void setMonths(int months) {
		this.months = months;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

}

package com.example.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class DateHelper {
private Calendar calendar;
	
	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

	public Date StringToDate(String s) {

	    Date result = null;
	    
	    try {
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // ("yyyy-MM-dd HH:mm:ss");
	        result  = dateFormat.parse(s);
	    } catch(ParseException e) {
	        e.printStackTrace();
	        return null;
	    }
	    
	    return result;
	}
	
	public Boolean isAdult() {
		return getAge() > 17 ? true : false;
	}
	
	private int getAge() {
		LocalDate l1 = LocalDate.of(getYear(), getMonth(), getDate());
		LocalDate now1 = LocalDate.now();
		Period diff1 = Period.between(l1, now1);
		System.out.println(l1);
		System.out.println(now1);
		System.out.println(diff1);
		return diff1.getYears();
	}
	
	public int getDay() {
		return getCalendar().get(Calendar.DAY_OF_MONTH);
	}
	
	public int getMonth() {
		return getCalendar().get(Calendar.MONTH);
	}
	
	public int getYear() {
		return getCalendar().get(Calendar.YEAR);
	}
	
	public int getDate() {
		return getCalendar().get(Calendar.DATE);
	}

}

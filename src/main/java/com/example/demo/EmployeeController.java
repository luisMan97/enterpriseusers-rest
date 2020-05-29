package com.example.demo;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.SOAPclient.SoapClient;

@RestController
public class EmployeeController {
	
	@Autowired
    private SoapClient soapClient;
	
	@GetMapping("employee")
	public EmployeeResponse employee(@RequestParam(value = "name") String name,
							 @RequestParam(value = "lastname") String lastname,
							 @RequestParam(value = "document_type") String documentType,
							 @RequestParam(value = "document") String document,
							 @RequestParam(value = "birth") String birth,
							 @RequestParam(value = "vinculation") String vinculation,
							 @RequestParam(value = "position") String position,
							 @RequestParam(value = "salary") String salary) {
		
		if (name == null || lastname == null || documentType == null || document == null || birth == null || vinculation == null || position == null || salary == null) {
			return errorMessage("All fields are required");
		}
		
		if (name.isEmpty() || lastname.isEmpty() || documentType.isEmpty() || document.isEmpty() || birth.isEmpty() || vinculation.isEmpty() || position.isEmpty() || salary.isEmpty()) {
			return errorMessage("Fields is not should empty");
		}
		
		DateHelper dh = new DateHelper();
		Date bithDate = dh.StringToDate(birth);
		Date vinculationDate = dh.StringToDate(vinculation);
		
		if (bithDate == null || vinculationDate == null) {
			return errorMessage("Date is not correct format");
		}
		
		Calendar calendar = Calendar.getInstance();
		dh.setCalendar(calendar);
		
		dh.getCalendar().setTime(vinculationDate);
		DetailDate vd = new DetailDate(dh.getYear(), dh.getMonth(), dh.getDay());
		
		dh.getCalendar().setTime(bithDate);
		DetailDate age = new DetailDate(dh.getYear(), dh.getMonth(), dh.getDay());
		
		if (!dh.isAdult()) {
			return errorMessage("The employee should be adult");
		}
		
		com.example.demo.Employee employee = new com.example.demo.Employee();
		employee.setBirth(birth);
		employee.setDocument(document);
		employee.setDocumentType(documentType);
		employee.setLastname(lastname);
		employee.setName(name);
		employee.setPosition(position);
		employee.setSalary(salary);
		employee.setVinculation(vinculation);
		
		soapClient.insertDB(employee);
		
		return new EmployeeDate(age, vd);
	}
	
	private ErrorMessage errorMessage(String message) {
		return new ErrorMessage(message);
	}

}

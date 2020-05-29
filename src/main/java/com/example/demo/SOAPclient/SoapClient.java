package com.example.demo.SOAPclient;

import javax.xml.bind.JAXBElement;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.luis.enterprise.Employee;
import com.luis.enterprise.SetEmployee;
import com.luis.enterprise.SetEmployeeResponse;

@Service
@Component("employeedb")
public class SoapClient extends WebServiceGatewaySupport {
	
	private String endpoint = "http://localhost:1515/soap/employeedb?wsdl";

    public void insertDB(com.example.demo.Employee employee) {
    	Employee employeeModel = new Employee();
    	employeeModel.setName(employee.getName());
    	employeeModel.setLastname(employee.getLastname());
    	employeeModel.setDocumentType(employee.getDocumentType());
    	employeeModel.setDocument(employee.getDocument());
    	employeeModel.setBirth(employee.getBirth());
    	employeeModel.setSalary(employee.getSalary());
    	employeeModel.setVinculation(employee.getVinculation());
    	employeeModel.setPosition(employee.getPosition());
    
    	SetEmployee request = new SetEmployee();
    	request.setArg0(employeeModel);
       
    	JAXBElement<SetEmployeeResponse> response = (JAXBElement<SetEmployeeResponse>) getWebServiceTemplate().marshalSendAndReceive(endpoint, request);
    	System.out.println(response.getValue());
    }

}
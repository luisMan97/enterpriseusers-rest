
package com.luis.enterprise;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.luis.enterprise package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SetEmployeeResponse_QNAME = new QName("http://enterprise.luis.com/", "setEmployeeResponse");
    private final static QName _SetEmployee_QNAME = new QName("http://enterprise.luis.com/", "setEmployee");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.luis.enterprise
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetEmployee }
     * 
     */
    public SetEmployee createSetEmployee() {
        return new SetEmployee();
    }

    /**
     * Create an instance of {@link SetEmployeeResponse }
     * 
     */
    public SetEmployeeResponse createSetEmployeeResponse() {
        return new SetEmployeeResponse();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://enterprise.luis.com/", name = "setEmployeeResponse")
    public JAXBElement<SetEmployeeResponse> createSetEmployeeResponse(SetEmployeeResponse value) {
        return new JAXBElement<SetEmployeeResponse>(_SetEmployeeResponse_QNAME, SetEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://enterprise.luis.com/", name = "setEmployee")
    public JAXBElement<SetEmployee> createSetEmployee(SetEmployee value) {
        return new JAXBElement<SetEmployee>(_SetEmployee_QNAME, SetEmployee.class, null, value);
    }

}

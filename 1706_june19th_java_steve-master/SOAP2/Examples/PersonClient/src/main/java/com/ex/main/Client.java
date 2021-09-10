package com.ex.main;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.ex.exceptions.PersonNotFoundException;
import com.ex.model.Person;
import com.ex.soap.HelloWorld;

public class Client {
	public static void main(String[] args) {

		/*
		 * Set up SOAP client using Apache CXF
		 */
		String serviceUrl = "http://localhost:8085/PersonService/HelloWorld";
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(HelloWorld.class);
		factory.setAddress(serviceUrl);
		
		/*
		 * Optional settings - view SOAP Messages
		 */
		LoggingInInterceptor inInterceptor = new LoggingInInterceptor();
		inInterceptor.setPrettyLogging(true);
		LoggingOutInterceptor outInterceptor = new LoggingOutInterceptor();
		outInterceptor.setPrettyLogging(true);
		
		factory.getInInterceptors().add(inInterceptor);
		factory.getOutInterceptors().add(outInterceptor);
		
		/*
		 * Consume SOAP Web Service
		 */
		HelloWorld helloWorldService = (HelloWorld) factory.create();
		String response = helloWorldService.sayHi("John");
		System.out.println(response);
		
		
		String savePersonResponse = helloWorldService.savePerson(new Person("austin", 24));
		System.out.println(savePersonResponse);
		
		try {
			Person john = helloWorldService.getPersonByName("john");
			System.out.println(john);
		} catch (PersonNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Person amy = helloWorldService.getPersonByName("amy");
			System.out.println(amy);
		} catch (PersonNotFoundException e) {
			e.printStackTrace();
		}
		
		
		

	}
}

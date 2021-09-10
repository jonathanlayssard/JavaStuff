package com.ex.main;

import java.util.List;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.company.project.module.exception.LibraryFullException;
import org.company.project.module.model.Book;
import org.company.project.module.services.Library;


public class Client {
	public static void main(String[] args) {

		/*
		 * Set up SOAP client using Apache CXF
		 */
		String serviceUrl = "http://localhost:8085/LibraryService/Library";
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(Library.class);
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
		Library library = (Library) factory.create();
		List<Book> bookList = library.getAllBooks();
		for(Book temp:bookList){
			System.out.println(temp);
		}
		
		try {
			String response = library.addBook(new Book("The Art of Readable Code", "Dustin Boswell,Trevor Foucher", 2011));
			System.out.println(response);
		} catch (LibraryFullException e) {
			e.printStackTrace();
		}
		
		try {
			String response = library.addBook(new Book("Test Title", "Test Author", 1999));
			System.out.println(response);
		} catch (LibraryFullException e) {
			e.printStackTrace();
		}
		
	}
}

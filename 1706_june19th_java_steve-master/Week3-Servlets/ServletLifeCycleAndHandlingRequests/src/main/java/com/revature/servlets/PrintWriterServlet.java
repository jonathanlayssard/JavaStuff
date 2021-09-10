package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrintWriterServlet extends HttpServlet {

	/*
	 * 	url for PrintWriterServlet 
	 * 
	 * 		/print
	 * 
	 * 	PrintWriter is used to Directly respond from a Servlet
	 * 			1 Request & 1 Response
	 * 
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		System.out.println("PrintWriterServlet - GET");
		
		PrintWriter out = resp.getWriter();
		out.write("<h1>PrintWriter sends back a directly from a Servlet!</h1>");
		out.write("<h1>another write</h1>");
		out.write("<h1>another write</h1>");
		out.write("<h1>another write</h1>");
	}
	
	
	
	
}

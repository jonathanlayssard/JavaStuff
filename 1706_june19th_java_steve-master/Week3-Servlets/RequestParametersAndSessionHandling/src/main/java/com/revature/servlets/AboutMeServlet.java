package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("test/aboutMe") //shorthand for mapping in web.xml
public class AboutMeServlet extends HttpServlet{

	/*
	 *  URL for AboutMeServlet
	 *  
	 *  	/aboutMe
	 */
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("AboutMeServlet -GET");
		req.getRequestDispatcher("test/AboutMe.jsp").forward(req, resp); //Chaining forward, just shorthand
	}
	
}

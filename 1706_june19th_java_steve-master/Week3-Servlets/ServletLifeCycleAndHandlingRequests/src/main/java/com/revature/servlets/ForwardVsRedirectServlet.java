package com.revature.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForwardVsRedirectServlet extends HttpServlet {

		/*
		 *   Url for ForwardVsRedirectServlet
		 *   
		 *   	/forwardVsRedirect
		 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		System.out.println("ForwardVsRedirectServlet -GET");
		
		//Forward
			/*
			 *  Use the Request Object
			 *  1 Request, 1 Response
			 * 	forward is considered faster because 1 request, 1 response
			 *  Must stay on server (can't forward to another domain e.g. google.com)
			 */
		
//		RequestDispatcher rd = req.getRequestDispatcher("index.html"); 					//Good, stays on server
//		RequestDispatcher rd = req.getRequestDispatcher("https://www.google.com/");		//Bad, tries to leave server
//		rd.forward(req, resp);
		
		//Redirect
			/*
			 *  Use the Response Object
			 *  2 Requests, 2 Responses
			 *  Updates the Client's URL on the 2nd Request
			 *  Can redirect to another server or another location on the same server
			 *  
			 */
//		resp.sendRedirect("https://www.google.com/");
		resp.sendRedirect("html-pages/test.html");
		
	}
	
}

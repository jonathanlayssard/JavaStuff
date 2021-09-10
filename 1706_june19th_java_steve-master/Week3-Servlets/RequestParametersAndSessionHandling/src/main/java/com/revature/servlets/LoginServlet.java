package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.beans.UserBean;
import com.revature.service.Service;

public class LoginServlet extends HttpServlet {

	
	/*
	 * 	URL for LoginServlet
	 * 			/login
	 * 
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		System.out.println("LoginServlet -GET");
		resp.sendRedirect("index.html");
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("LoginServlet -POST");
		
		UserBean clientUser = new UserBean();
	
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		
		clientUser.setUsername(username);
		clientUser.setPassword(password);
		
		clientUser = new Service().authenticateUser(clientUser); //Either receive a valid user or null
		
		
		System.out.println("The user enter: " + username + " & " + password);
		if(clientUser != null){
			
			HttpSession session = req.getSession(); //j_session_id stored in a cookie on the client's browser
			
			session.setAttribute("user", clientUser); //The parameters: name, and the actual object that want to store in the session
			
			
//			resp.getWriter().write("<h1>Weclome " + username + "</h1>");
			
		/*
		 		Long way
			RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
			rd.forward(req, resp);
		
		 */	
			//Shorthand
			req.getRequestDispatcher("home.jsp").forward(req, resp);
		}else{
			resp.sendRedirect("index.html");
		}
	}
	
	
	
	
	
}

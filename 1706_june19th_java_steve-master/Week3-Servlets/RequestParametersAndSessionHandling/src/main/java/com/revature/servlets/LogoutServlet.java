package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet{

	/*
	 * 	URL for LogoutServlet
	 * 			/logout
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			System.out.println("LogoutServlet - GET");
			HttpSession session = req.getSession();
			session.invalidate();
			
			resp.sendRedirect("index.html");
			
			
	}
}

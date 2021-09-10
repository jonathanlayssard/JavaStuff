package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleServlet extends HttpServlet {

	/*
	 * 		Url for LifeCycleServlet
	 * 			/life
	 * 
	 * 	What is a Servlet's LifeCycle?
	 * 			init()
	 * 			service()
	 * 			destroy()
	 * 
	 */
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp ) throws IOException, ServletException{
		System.out.println("LifeCycleServlet - GET");
	}
	
	
	/*
	 * 	Life Cycle of Servlets
	 */
	@Override
	public void init() throws ServletException {
		System.err.println("LifeCycleServlet - init()");
		super.init();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.err.println("LifeCycleServlet - service()");
		super.service(req, resp);
	}
	
	@Override
	public void destroy() {
		System.err.println("LifeCycleServlet - destroy()");
		super.destroy();
	}
	
	
}

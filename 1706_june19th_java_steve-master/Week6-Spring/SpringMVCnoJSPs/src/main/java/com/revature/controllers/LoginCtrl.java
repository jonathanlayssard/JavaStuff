package com.revature.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.revature.bean.User;

@Controller
public class LoginCtrl {

	/*
	 * RequestMapping - for controller classes
	 */
	@RequestMapping("/login")
	public ModelAndView home(){
		System.out.println("LoginCtrl");
		return new ModelAndView("/static/login.html");
	}
	
	/*
	 * RequestMappings default to ALL REQUEST TYPES!
	 * 		Read-get
	 * 		CREATE-post
	 * 		UPDATE-put
	 * 		DELETE-delete
	 * 		-trace
	 * 		-options
	 * 		-head
	 */
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public  @ResponseBody String login(User user, HttpServletRequest req){
		System.out.println("LoginCtrl - GET OR POST?" );
		System.out.println("User entered: " + user);
		System.out.println("request object: " + req.getParameter("username"));
		return "Home page message, a json object";
	}
	
}

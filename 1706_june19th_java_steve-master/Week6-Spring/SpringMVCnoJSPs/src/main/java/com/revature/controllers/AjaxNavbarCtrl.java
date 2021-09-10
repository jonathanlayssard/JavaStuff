package com.revature.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AjaxNavbarCtrl {

	@RequestMapping("/app")
	public String app(){
		System.out.println("app page");
		return "/static/app.html";
	}
	
	@RequestMapping("/ajaxNavbar")
	public String navbar(){
		System.out.println("return Navbar HTML Fragment");
		return "/static/features/navbar/navbar.html";
	}
}

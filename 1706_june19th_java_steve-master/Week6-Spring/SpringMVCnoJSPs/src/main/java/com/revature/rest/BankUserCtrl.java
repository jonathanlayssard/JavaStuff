package com.revature.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankUserCtrl {

	@RequestMapping(value="/ajaxBankInfo")
	public @ResponseBody String bankUserInfo(){
		System.out.println("bank user json");
		//instantiate a bank user, wrap with Jackson into a JSON String
		return "this would be a json string";
	}
}

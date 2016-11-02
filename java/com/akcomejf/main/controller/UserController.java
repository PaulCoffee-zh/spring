package com.akcomejf.main.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.akcomejf.main.domain.User;
import com.akcomejf.main.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/getUser")
	public String index(HttpServletRequest request){
		User user = userService.findById(1L);
		request.setAttribute("user", user);
		System.out.println("all ");
		return "/userInfo";
	}
	
}

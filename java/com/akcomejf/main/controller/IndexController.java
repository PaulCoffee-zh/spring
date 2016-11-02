package com.akcomejf.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.akcomejf.main.common.BaseController;

@Controller
public class IndexController extends BaseController{
	
	@RequestMapping(value = { "/", "/{[a-z]+}" },method=RequestMethod.GET)
	public String redict( String userId){
		System.out.println(userId);
		System.out.println(request.getAttribute("userId"));
		return "redirect:/index.html";
	}
	
	@RequestMapping("/index.html")
	public String index(){
		return "/index";
	}
}

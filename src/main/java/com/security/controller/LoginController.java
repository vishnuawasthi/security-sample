package com.security.controller;



import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {

	
	@RequestMapping(value="/homeUser",method=RequestMethod.GET)
	public ModelAndView showUser() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("homeUser");
		modelAndView.addObject("message", "You have logged in successfully,User");
		return  modelAndView;
	}
	
	@RequestMapping(value="/homeAdmin",method=RequestMethod.GET)
	public ModelAndView showAdmin(Principal principal) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("username", principal.getName());
		modelAndView.setViewName("homeAdmin");
		modelAndView.addObject("message", "You have logged in successfully,Admin");
		return  modelAndView;
	}
	
	@RequestMapping(value="/login",method= {RequestMethod.POST ,RequestMethod.GET})
	public ModelAndView login(@RequestParam(value="error",required=false) String error,
			@RequestParam(value="logout",required=false) String logout) {
		System.out.println("login() - start");
		ModelAndView modelAndView = new ModelAndView();
		if(error!= null) {
			modelAndView.addObject("error", "Invalid username or password");
			System.out.println("toString ::  "+error.toString());
		}
		
		if(logout!= null) {
			modelAndView.addObject("logout", "You have loggedout successfully..!");
		}
		
		modelAndView.setViewName("login");
		System.out.println("login() - end");
		return  modelAndView;
	}
	
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public ModelAndView home(Principal principal) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("username", principal.getName());
		
		modelAndView.setViewName("home");
		modelAndView.addObject("message", "You have logged in successfully");
		return  modelAndView;
	}
	
	@RequestMapping(value="/acccessDenied",method=RequestMethod.GET)
	public ModelAndView acccessDenied() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("403");
		modelAndView.addObject("message", "You do not  have privileges to access the requested resource..!");
		return  modelAndView;
	}
	
	
}

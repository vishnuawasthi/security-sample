package com.security.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.security.entity.User;
import com.security.model.Employee;


@Controller
public class LearningUserController {

	//@Autowired
	//private Environment environment;
	
	
	@Value(value="${com.sample.app.name}")
	private String applicationName;
	
	
	@RequestMapping(value="/required")
	public ModelAndView testRequired(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("Value from properties : "+applicationName);
		
		System.out.println("Get contextPath : "+request.getContextPath());
		
		System.out.println("Get RemoteUser : "+request.getRemoteUser());
		
		System.out.println("Get RemoteHost  : "+request.getRemoteHost());
		
		User user = User.builder()
						.id(1L)
						.username("admin@securities.com")
						.password("Secure*123")
						.build();
		
		System.out.println("user {}   "+user);
		
		
		
		Employee emp = new Employee();
		emp.setId(1L);
		modelAndView.setViewName("required");
		return modelAndView;
	}
}

package com.security.helpers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;

public class CustomAccessDeniedHandler  implements org.springframework.security.web.access.AccessDeniedHandler{

	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		request.getRequestDispatcher("acccessDenied").forward(request, response);;
		
	}

}

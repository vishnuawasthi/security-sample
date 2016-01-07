package com.security.service;


import org.springframework.stereotype.Service;


public interface LoginService {
	public abstract boolean validateUser(String username, String password);

	@Service

	public class Impl implements LoginService {

		@Override
		public boolean validateUser(String username, String password) {
			// TODO Auto-generated method stub
			return false;
		}

		
	}
}

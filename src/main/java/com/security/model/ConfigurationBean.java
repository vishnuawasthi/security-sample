package com.security.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ConfigurationBean {

	@PostConstruct
	public void init() {
		System.out.println("init()  - start");

		System.out.println("init()  - end");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy()  - start");

		System.out.println("destroy()  - end");
	}
}

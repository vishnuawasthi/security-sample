package com.security.model;

public class Employee {

	private Long id;
	private String name;

	private Address address;

	public Long getId() {
		return id;
	}

	public Address getAddress() {
		return address;
	}

	// @Required
	public void setAddress(Address address) {
		this.address = address;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void init() {
		System.out.println("init() - start");
	}

	public void destroy() {
		System.out.println("destroy() - start");
	}

}

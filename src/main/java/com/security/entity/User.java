package com.security.entity;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;






@Builder
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class User {

	private Long id;
	private String username;
	private String password;
}

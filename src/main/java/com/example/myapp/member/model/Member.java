package com.example.myapp.member.model;

import lombok.Data;

@Data
public class Member {
	private String userid;
	private String name;
	private String password;
	private String password2;
	private String email;
	private String phone;
	private String role;
}

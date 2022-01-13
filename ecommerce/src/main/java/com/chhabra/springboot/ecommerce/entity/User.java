package com.chhabra.springboot.ecommerce.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class User {

		@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String email;
	private String password;
	private String role;
	private String resetPasswordToken;
	private String resetPassowrdExpire;
	private String avatarUrl;


}

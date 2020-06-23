package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USERTEST")
public class UserBean {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USERTEST_SEQ")
	@SequenceGenerator(sequenceName="USERTEST_SEQ",allocationSize=1,name="USERTEST_SEQ")
	private int id;
	private String username;
	private String password;
	private String role;

	//-------------------------Constructors----------------------//
	public UserBean(String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}

	
	public UserBean(int id, String username, String password, String role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
//------------------------------END------------------------------//
	
	public UserBean() {
		super();
	}	
	
//-------------------------Getters and Setters----------------------//
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
//--------------------------------END------------------------------//
}
	
	
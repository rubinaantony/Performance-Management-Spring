package com.example.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TBL_EMPREVIEW")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMPREV_SEQ")
	@SequenceGenerator(sequenceName="TBL_EMPREVIEW_SEQ",allocationSize=1,name="EMPREV_SEQ")
	private int e_id;
	private String e_number;
	private String e_name;
	private String e_username;
	private String e_password;
	private String e_address;
	private String e_mobile;
	private String e_email;
	private String e_role;
	
	//-------------------------Constructor----------------------//	
	
	public Employee(int e_id, String e_number, String e_name, String e_username, String e_password, String e_address,
			String e_mobile, String e_email, String e_role) {
		super();
		this.e_id = e_id;
		this.e_number = e_number;
		this.e_name = e_name;
		this.e_username = e_username;
		this.e_password = e_password;
		this.e_address = e_address;
		this.e_mobile = e_mobile;
		this.e_email = e_email;
		this.e_role = e_role;
	}
	
	
	public Employee() {
		super();
	}
	
	//-------------------------END-------------------------------------//

	//-------------------------Getters and Setters----------------------//
	@Column(nullable = false)
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	
	@Column(nullable = false)
	public String getE_number() {
		return e_number;
	}
	public void setE_number(String e_number) {
		this.e_number = e_number;
	}
	
	@Column(nullable = false)
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	
	@Column(nullable = false)
	public String getE_username() {
		return e_username;
	}
	public void setE_username(String e_username) {
		this.e_username = e_username;
	}
	
	@Column(nullable = false)
	public String getE_password() {
		return e_password;
	}
	public void setE_password(String e_password) {
		this.e_password = e_password;
	}
	
	@Column(nullable = false)
	public String getE_address() {
		return e_address;
	}
	public void setE_address(String e_address) {
		this.e_address = e_address;
	}
	
	@Column(nullable = false)
	public String getE_mobile() {
		return e_mobile;
	}
	public void setE_mobile(String e_mobile) {
		this.e_mobile = e_mobile;
	}
	
	@Column(nullable = false)
	public String getE_email() {
		return e_email;
	}
	public void setE_email(String e_email) {
		this.e_email = e_email;
	}
	
	@Column(nullable = false)
	public String getE_role() {
		return e_role;
	}
	public void setE_role(String e_role) {
		this.e_role = e_role;
	}
	//-------------------------END----------------------//	

}

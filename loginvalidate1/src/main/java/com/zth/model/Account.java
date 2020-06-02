package com.zth.model;

public class Account {
	private int ac_id;
	private String ac_username;
	private String ac_password;
	private String ac_type;
	private int us_id;
	
	public int getAc_id() {
		return ac_id;
	}
	public void setAc_id(int ac_id) {
		this.ac_id = ac_id;
	}
	public String getAc_username() {
		return ac_username;
	}
	public void setAc_username(String ac_username) {
		this.ac_username = ac_username;
	}
	public String getAc_password() {
		return ac_password;
	}
	public void setAc_password(String ac_password) {
		this.ac_password = ac_password;
	}
	public String getAc_type() {
		return ac_type;
	}
	public void setAc_type(String ac_type) {
		this.ac_type = ac_type;
	}
	public int getUs_id() {
		return us_id;
	}
	public void setUs_id(int us_id) {
		this.us_id = us_id;
	}
}

package com.cn.bean;

public class user {
	/**
	 * 用户ID
	 */
	private int id;
	/**
	 * 用户名
	 */
	private String username;

	
	/**
	 * 密码
	 */
	private String passwrod;
	
	/**
	 * 电子邮箱
	 * @return
	 */
  private String email;

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

	public String getPasswrod() {
		return passwrod;
	}

	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public user(int id, String username, String passwrod, String email) {
		super();
		this.id = id;
		this.username = username;
		this.passwrod = passwrod;
		this.email = email;
	}

	@Override
	public String toString() {
		return "user [id=" + id + ", username=" + username + ", passwrod="
				+ passwrod + ", email=" + email + "]";
	}

	
	
}

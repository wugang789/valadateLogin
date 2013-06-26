package com.cn.struts2;

import com.cn.bean.user;
import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport{
	private static final String SUCCESS="success";
	private static final String FAIl="fail";
	private user u;
	public String show(){
		System.out.println("...................");
     		if(u.getUsername().equals("admin")&&u.getPasswrod().equals("admin")){
     			System.out.println(">..............");
     			return SUCCESS;
     		}else{
     			System.out.println(">............kkkkk..");
     			return  FAIl;
     		}
	}
	
	public void setU(user u) {
		this.u = u;
	}
	public user getU() {
		return u;
	}

}

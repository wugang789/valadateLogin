package com.cn.intercepter;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class intecepter extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("ִ��ǰ");
		String result=arg0.invoke();
		System.out.println("��");
		return result;
	}

}

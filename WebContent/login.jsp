<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="Login.action" validate="true" >
<s:textfield name="u.username" label="用户名"></s:textfield>
<s:textfield name="u.password" label="密码"></s:textfield>
<s:textfield name="u.email" label="邮箱"></s:textfield>
<s:submit></s:submit>
</s:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<meta http-equiv="Content-Language" content="English"/>
<title>Register Contact</title>
</head>
<body>
<form:form modelAttribute="user" method="post">
<tr>
<td>Username:</td>
<td>
<form:input path="username" placeholder="input username" />
<form:errors path="username"/>
</td>
</tr>
<tr>
<td>Password:</td>
<td>
<form:input path="password" type="password" placeholder="input password" />
<form:errors path="password"/>
</td>
</tr>
<tr>
<td>E-mail Address:</td>
<td>
<form:input path="email" placeholder="input email add" />
<form:errors path="email"/>
</td>
<br>
<input type="submit" value="Register Contact" />
</form:form>
</body>
</html>
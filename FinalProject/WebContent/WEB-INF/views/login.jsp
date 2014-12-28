<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<style>
.errorblock {
color: #ff0000;
background-color: #ffEEEE;
border: 3px solid #ff0000;
padding: 8px;
margin: 16px;
}
</style>
</head>
<body onload='document.f.j_username.focus();'>
<h3>Login with Username and Password (Custom Page)</h3>

<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>

<form name='login' action="<c:url value='j_spring_security_check' />"
method='POST'  commandName="login">

<table>
<tr>
<td>User:</td>
<td><input type='text' name='j_username' value=''>
</td>
</tr>
<tr>
<td>Password:</td>
<td><input type='password' name='j_password' />
</td>
</tr>
<tr>
<td colspan='2'><input name="submit" type="submit"
value="submit" />
</td>
</tr>
</table>

</form>
</body>
</html>
<%@ page session="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Title : ${title}</h1>
	<h1>Message : ${message}</h1>

<section>
		<!-- Main content area -->
		<header>
			<h1>
				inspection search
			</h1>
		</header>
		<div class="submenu-button">
			<header>Menu</header>
			<ul>
				<li><a href="project-create.do">Top</a></li>
				<li><a href="user-create.do">Inspection</a></li>
				<li><a href="company-create.do">Repair</a></li>
				<li><a href="accesstype-menu.do">Password Change</a></li>
			</ul>
		</div>

		<a href="<c:url value="registercontact"/>">Register New Contact</a>





	</section>


	<c:url value="/j_spring_security_logout" var="logoutUrl" />
	<form action="${logoutUrl}" method="post" id="logoutForm">
	</form>
	<script>
		function formSubmit() {
			document.getElementById("logoutForm").submit();
		}
	</script>

	<c:if test="${pageContext.request.userPrincipal.name != null}">
		<h2>
			Welcome : ${pageContext.request.userPrincipal.name} | <a
				href="javascript:formSubmit()"> Logout</a>
		</h2>
	</c:if>


</body>
</html>
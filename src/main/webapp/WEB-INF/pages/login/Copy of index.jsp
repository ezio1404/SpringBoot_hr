<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%-- <c:url value="/css/main.css" var="jstlCss" /> --%>
<link href="/css/main.css" rel="stylesheet" />
</head>
<body>
	${mikiUser} AND ${mikiPassword}
	<form action="http://localhost:8080/login" method="POST">
		<h1>Username</h1>: <input type="text" name="username"/><br/>
		<h2>Password</h2>: <input type="password" name="password"/><br/>
		<button type="button" onClick="testButton();">SUBMIT ME PLEASE</button> 
	</form>
</body>
<script src="/js/main.js"></script>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UPDATE STUDENT</title>
</head>
<body>
	<form action="http://localhost:8010/student/update" method="post">
		ID:
		<input type="text" name="studentId" value="${selectedStudent.id}" />
		<br /> Name:
		<input type="text" name="name" value="${selectedStudent.name}" />
		<br /> Age:
		<input type="text" name="age" value="${selectedStudent.age}" />
		<br />
		<button type="submit">Update Me!!!</button>
	</form>
</body>
</html>
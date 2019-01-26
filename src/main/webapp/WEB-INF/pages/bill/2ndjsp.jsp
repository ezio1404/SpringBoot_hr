<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
</head>
<body>
THIS IS THE MESSAGE - ${message}
THIS IS 2nd JSP ${userNameField}
<form method="get" action="http://localhost:8010/bill/hi2">
Name : <input type="text" name="nameField"/><br/>
Pass : <input type="password" name="passField"/><br/>
<button type="submit">Submit Me</button>
</form>
</body>
</html>

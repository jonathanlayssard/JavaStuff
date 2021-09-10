<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="com.revature.beans.UserBean" %>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>About me!</title>
</head>
<body>
	<h1><%= ((UserBean) session.getAttribute("user")).getUsername() %> about me, I'm awesome, duhh</h1>
<a href="logout">click me to logout buddy!</a>	

</body>
</html>
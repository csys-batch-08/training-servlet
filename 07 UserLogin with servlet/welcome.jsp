<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome User</title>
</head>
<body>
	<%
	User user = (User) session.getAttribute("CurrentUser");

	String userName = user.getName();
	%>

	<h1>Welcome 
		<%
		out.print(" "+userName + "    Available Balance:" + user.getWallet());
		%>
	</h1>

	<a href="#">Show All Products</a>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout</title>
</head>
<body>
     <%
     String name=(String) session.getAttribute("sessname");
     out.print("Hello User: You have entered the name: " + name);
     session.invalidate();
     %>
     <a href="login.jsp">Click here to logout!</a>
</body>
</html>
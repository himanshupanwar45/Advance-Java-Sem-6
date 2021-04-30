<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME</title>
</head>
<body>
    <%
    String uname=request.getParameter("username");
    out.print("Welcome "+ uname);
    session.setAttribute("sessname", uname);
    %>
    <a href="logout.jsp">Click here to get to home page</a>
</body>
</html>
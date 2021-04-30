<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN</title>
</head>
<body>
   <%
   String uname=request.getParameter("username");
   if(uname!=null)
	   out.print("Welcome "+uname);
   %>
   
   <form action="home.jsp">
   <input type="text" name="username" placeholder="Enter the Username">
   <input type="text" name="password" placeholder="Enter the Password"><br />
   <input type="submit" value="Login"><br />
   </form>
</body>
</html>
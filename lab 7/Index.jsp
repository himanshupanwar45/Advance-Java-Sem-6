<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%!  long n, result;
String str;

long fact(long n) {
   if(n==0)        
      return 1;   
   else
      return n*fact(n-1);
} %>

<body>
<%out.println(fact(6));%>
</body>
</html>
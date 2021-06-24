<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>LoginSucess!!!</h2>

<%

   HttpSession sess=request.getSession(true);

   String g1=(String)sess.getAttribute("j1");
   
   out.println("Welcome to HttpSession JSP::"+g1);

%>
</body>
</html>
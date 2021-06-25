<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="e1" value="${param.email}"></c:set>

<c:choose>

<c:when test="${e1.equals('admin')}">

<c:out value="Welcome to Application"></c:out>

</c:when>

<c:otherwise>

<%-- <c:out value="LoginFail!!"></c:out> --%>

<c:redirect url="sucess.jsp"></c:redirect>

</c:otherwise>

</c:choose>
</body>
</html>
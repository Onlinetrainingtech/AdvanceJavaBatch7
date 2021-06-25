<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <sql:setDataSource var="db" driver="org.h2.Driver"  
         url="jdbc:h2:tcp://localhost/~/fullstackbatch7" user="sa" password=""/>
  
    <sql:query dataSource="${db}" var="rs">  
    select * from ADDPRODUCT 
    </sql:query>  
       
    <table border="2" width="100%">  
    <tr>  
    <th>ProductId</th>  
    <th>ProductName</th>  
    <th>ProductPrice</th>  
     
    </tr>  
    <c:forEach var="table" items="${rs.rows}">  
    <tr>  
    <td><c:out value="${table.PRODUCTID}"/></td>  
    <td><c:out value="${table.PRODUCTNAME}"/></td>  
    <td><c:out value="${table.PRODUCTPRICES}"/></td>  
   
    </tr>  
    </c:forEach>  
    </table>  
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<table>
		   <tr>
		   <td>책제목</td>
		   </tr>
		   <c:forEach var="book" items="${books}"> 
		    <tr>
		   	<td> ${book}   </td>
		   </tr>   
	  	   </c:forEach> 
	   	</table>

</body>
</html>
<%@ page import= "Acorn.Student" %>
<%@ page import = "java.util.ArrayList" %>
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

<h2>에이콘 학생 리스트</h2>

<% ArrayList<Student> list = (ArrayList<Student>)request.getAttribute("list"); %>


<% // ArrayList<Customer> list  =(ArrayList<Customer>) request.getAttribute("list"); %>


<% /* for( int i=0; i< list.size() ;i++){	
	out.println( list.get(i).getId()  );
	out.println( list.get(i).getPw() );
	out.println( list.get(i).getName() +"<br>");
}*/%>



<c:forEach var="item" items="${list}">
	${item.id}
	${item.pw}
	${item.name} <br>
</c:forEach>


</body>
</html>
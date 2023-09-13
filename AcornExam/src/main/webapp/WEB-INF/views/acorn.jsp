<%@page import="Acorn.Member"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.ArrayList" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>에이콘 학생리스트</h2>
	
	<% ArrayList<Member> list = (ArrayList<Member>)request.getAttribute("list"); %>

	<% for(Member m : list) {
		out.println(m.getId());
		out.println(m.getPw());
		out.println(m.getName()+"<br>");
	}%>

</body>
</html>
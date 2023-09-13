<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h2>버킷리스트</h2>
	
	<% ArrayList<String> list = (ArrayList<String> ) request.getAttribute("bucketlist"); %>
	
	
	<% for(int i=0; i<list.size(); i++) {
		String bucket = list.get(i);
		out.println(bucket+"<br>");
	} %>


</body>
</html>
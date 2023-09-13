<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h2>내가 좋아하는 노래</h2>


<%
String[] song = (String[])request.getAttribute("song");


for(String item: song) {
	out.print(item + "<br>");
}

%>


</body>
</html>
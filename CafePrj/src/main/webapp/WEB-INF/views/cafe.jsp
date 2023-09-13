<%@ page import= "Cafe.Cafe" %>
<%@ page import = "java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>커피 메뉴 리스트</h2>

<% ArrayList<Cafe> list = (ArrayList<Cafe>)request.getAttribute("list"); %>


<% for(Cafe c : list) {
	out.println(c.getId());
	out.println(c.getName());
	out.println(c.getPrice() + "<br>");
}



%>


</body>
</html>
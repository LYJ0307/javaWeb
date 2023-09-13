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

<h2>3단 출력하기</h2>

<c:set var="3" value="3"/>

<c:forEach var="i" begin="1" end="9">
		<h3>${3}*${i}=${3*i}<br></h3>
</c:forEach>


</body>
</html>
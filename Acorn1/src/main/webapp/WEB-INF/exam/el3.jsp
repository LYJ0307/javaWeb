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


<h2> 성적에 따라 A, B, C, F(70미만) 출력하기 </h2>

<c:set var="kor" value="80"/>

<c:choose>
<c:when test="${kor >= 90}"><h3>A학점</h3></c:when>
<c:when test="${kor >= 80}"><h3>B학점</h3></c:when>
<c:when test="${kor >= 70}"><h3>C학점</h3></c:when>
<c:otherwise><h3>F학점</h3></c:otherwise>
</c:choose>


</body>
</html>
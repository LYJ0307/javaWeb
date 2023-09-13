<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<%

  String  id2 = (String) session.getAttribute("id");

  if( id2 != null){
	  out.println("로그인이 된 상태");
  }else if(  id2 == null){
	  out.println("로그인이 안된 상태");
  }
%>

</body>
</html>
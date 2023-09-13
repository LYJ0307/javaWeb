<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>참가자 등록</title>
<link href="./css/HY.css" rel="stylesheet" />
</head>


<script>


function check() { 	
	return true;	
}


</script>


<body>


<header>
<h2>HY라우드 오디션 ver 1.0</h2>
</header>

<nav>

	<ul>
	
	<li><a href="참가자등록.jsp">참가자등록</a></li>
	<li><a href="참가자조회.jsp">참가자목록 조회</a></li>
	<li><a href="참가자점수조회.jsp">참가자점수 조회</a></li>
	<li>참가자등수 조회</li>
	<li><a href="HY라우드오디션.jsp">홈으로</a></li>
	
	
	</ul>


</nav>


	
 <form name="frm" action="등록_action.jsp" method="post" onsubmit="return check()">
<table border="1">
	<caption>참가자 등록 </caption>
	
	<tr>
	<td>참가자ID</td>
	<td><input type="text" name="userid"></td>
	</tr>
	
	<tr>
	<td>참가자이름</td>
	<td><input type="text" name="username"></td>
	</tr>
	
	<tr>
	<td>생년월일</td>
	<td><input type="text" name="userbirthy">년<input type="text" name="userbirthm">월<input type="text" name="userbirthd">일</td>
	</tr>
	
	<tr>
	<td>성별</td>
	<td><input type="radio"  name="gender" value="M">남<input type="radio" name="gender" value="W">여</td>
	
	</tr>
	
	
	<tr>
	<td>실력무대</td>
	<td>
	<select name="specialty">
		<option value="">선택</option>
		<option value="V">[V] 보컬</option>
		<option value="D">[D] 댄스</option>
		<option value="R">[R] 랩</option>
	</select>
	</td>
	</tr>
	
	
	<tr>
	<td>매력무대</td>
	<td><input type="text" name="charming"></td>
	</tr>
	
	
	<tr>
	<td colspan="2">
	
	<button>저장</button>
	<button>취소</button>

	</td>
	</tr>
	
	
</table>
	</form>
	
	
</body>
</html>
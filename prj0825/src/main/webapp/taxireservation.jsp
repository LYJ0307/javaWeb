<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>택시 예약 프로그램</title>
<link href="./css/texireservation.css" rel="stylesheet" />
</head>
<body>

<header>
</header>

	<section>
	<table>
	<caption>택시 예약 등록</caption>
	<tr>
		<td>예약번호</td>
		<td><input type="text"></td>
	</tr>
	<tr>
		<td>예약시간</td>
		<td><input type="text"></td>
	</tr>
	<tr>
		<td>예약날짜</td>
		<td><input type="text"></td>
	</tr>
	<tr>
		<td>고객아이디</td>
		<td><input type="text"></td>
	</tr>
	<tr>
		<td>출발지</td>
		<td><input type="text"></td>
	</tr>
	<tr>
		<td>목적지</td>
		<td><input type="text"></td>
	</tr>
	<tr>
		<td>택시번호</td>
		<td><input type="text"></td>
	</tr>
	<tr>
		<td>배차상태</td>
		<td>
			<select>
			<option>선택하기</option>
			<option>배치완료</option>
			<option>배차준비</option>
			<option>배차미정</option>			
			</select>
		</td>
	</tr>
	<tr>
		<td colspan="2">
		<button>등록</button>
		<button>다시입력</button>
		<td>
	</tr>
	</table>
	</section>
	
</body>
</html>
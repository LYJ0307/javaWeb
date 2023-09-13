<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@  page import="java.sql.*" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./css/HY.css" rel="stylesheet" />
</head>
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


	
	<table border="1">
	<caption>참가자 점수 조회 </caption>
	
	<tr>
	<td>계좌번호</td>
	<td>참가자ID</td>
	<td>참가자이름</td>
	<td>생년월일</td>
	<td>점수</td>
	<td>등급</td>
	<td>멘토이름</td>
	</tr>
	
	
	<%
Connection con=null;
Statement st = null;
ResultSet rs = null;
try{ 
	String driver = "oracle.jdbc.driver.OracleDriver" ;
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	 //1. 오라클드라이버 로딩
	Class.forName(driver); //2. 데이터베이스 연결
	con= DriverManager.getConnection(url, user, password); //3. statement 얻어오기
	st = con.createStatement();
	 //4. 필요한 sql 작성
			String 	sql = "select score_no, "; 
					sql +=	"artistid, "; 
					sql +=	"join_nm, " ;
					sql +=	"to_char(to_date(birth), 'yyyy\"년\"mm\"월\"dd\"일\"'), " ;
					sql +=	"score, " ;
					sql +=	"case  ";
					sql +=	"when score >= 90 THEN 'A'" ;
					sql +=	"when score >= 80 then 'B'" ;
					sql +=	"when score >= 70 then 'C'" ;
					sql +=	"else 'D' end, " ;
					sql +=	"mentor_nm ";
					sql +=	"from tbl_mentor_200 m ";
					sql +=	"JOIN tbl_score_200 s ";
					sql +=	"ON m.MENTOR_ID = s.MENTORID ";
					sql +=	"JOIN tbl_join_200 j ";
					sql +=	"ON s.ARTISTID = j.JOIN_ID ";
    System.out.println( sql);
	rs = st.executeQuery( sql) ;
	 //6. 가져온 쿼리 결과를 화면에 출력하기
	while( rs.next() ) { 
%>


<tr>
		<td> <%= rs.getString(1) %></td>
		<td><%= rs.getString(2) %></td>
		<td><%= rs.getString(3) %></td>
		<td><%= rs.getString(4) %></td>
		<td><%= rs.getString(5) %></td>
		<td><%= rs.getString(6) %></td>	
		<td><%= rs.getString(7) %></td>
						
</tr>



<%
	}
	}catch(Exception e){
		e.printStackTrace();
	}
	finally{ //자원의 반납
		if( rs!= null) rs.close();
		if( st != null) st.close();
		if( con != null) con.close();
	}
%>
	
</table>	


</body>
</html>
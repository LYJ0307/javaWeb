<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>택시 예약 프로그램</title>
<link href="./css/index.css" rel="stylesheet" />


<style>

</style>

</head>
<body>


<header>
  택시 예약 프로그램
</header>




<nav>

<ul>
<li>택시예약</li>
<li>택시수정</li>
<li>택시현황</li>
<li>홈으로</li>
</ul>

</nav>


<section>



<table>
<tr>
택시 호출 현황
<td>고객전화번호</td>
<td>예약번호</td>
<td>예약시간<br>(시/분)</td>
<td>예약일자<br>(년/월/일)</td>
<td>고객명</td>
<td>출발지</td>
<td>목적지</td>
<td>택시번호</td>
<td>고객명</td>
<td>관리</td>
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
	String sql = "select substr(cust.tel,1,3) || '-' || substr(cust.tel, 4, 4) || '-' ||  substr(cust.tel, 8, 4) tel ";
		    sql+= ", call.regno, "; 
		    sql+= "substr(lpad(regtime, 4, '0'), 1, 2) || ':' || substr(lpad (regtime, 4, '0'), 3, 2) regtime , ";
		    sql+= "to_char(call.regdate, 'yyyy-mm-dd'), ";
		    sql+= "cust.name, call.startpoint, "; 
		    sql+= "call.destination, call.taxino, "; 
		    sql+= "decode(call.state, 'P', '배차완료', 'R', '배차준비', 'X', '배차미정') ";
		  	sql+= "from tblcall_list call ";
		  	sql+= "join tblcust cust ";
		  	sql+= "on call.CUSNO = cust.id ";
    System.out.println( sql);
	rs = st.executeQuery( sql) ;
	 //6. 가져온 쿼리 결과를 화면에 출력하기
	while( rs.next() ) { 
%>


<!-- db 연동 후 데이터 조회 부분 -->
<tr>
		<td> <%= rs.getString(1) %></td>
		<td><%= rs.getString(2) %></td>
		<td><%= rs.getString(3) %></td>
		<td><%= rs.getString(4) %></td>
		<td><%= rs.getString(5) %></td>
		<td><%= rs.getString(6) %></td>
		<td><%= rs.getString(7) %></td>		
		<td><%= rs.getString(8) %></td>		
		<td><%= rs.getString(9) %></td>
		<td></td>		
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

</section>



<footer>
HRD Korea
</footer>





</body>
</html>
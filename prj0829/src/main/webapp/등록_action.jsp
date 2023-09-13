<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  page import="java.sql.*" %>
 
 
 <%
 
 request.setCharacterEncoding("UTF-8");
 
 
 
 String userid= request.getParameter("userid");
 String username= request.getParameter("username");
 String userbirthy= request.getParameter("userbirthy");
 String userbirthm= request.getParameter("userbirthm");
 String userbirthd= request.getParameter("userbirthd");
 
 String userbirth = userbirthy + userbirthm + userbirthd;
 
 String gender= request.getParameter("gender");
 String specialty= request.getParameter("specialty");
 String charming= request.getParameter("charming");
 
 
 
 out.println(userid);
 out.println(username);
 out.println(userbirthy);
 out.println(userbirthm);
 out.println(userbirthd);
 
 out.println(gender);
 out.println(specialty);
 out.println(charming);
 
  

 
	Connection con=null;
	PreparedStatement  st = null;
 
	try{ 
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		 //1. 오라클드라이버 로딩
		Class.forName(driver); //2. 데이터베이스 연결
		con= DriverManager.getConnection(url, user, password); //3. statement 얻어오기
		String sql ="insert into tbl_join_200 values(?,?,?,?,?,?)"; //5. 최종적으로 실행
		st = con.prepareStatement(sql);
		
		
		st.setString(1, userid);
		st.setString(2, username);
		st.setString(3, userbirth);
		st.setString(4, gender);
		st.setString(5, specialty);
		st.setString(6, charming);
		
		 //4. 필요한 sql 작성
	    st.executeUpdate() ;
		 //6. 가져온 쿼리 결과를 화면에 출력하기
	 
	}catch(Exception e){
		e.printStackTrace();
	}
	finally{ //자원의 반납
		 
		if( st != null) st.close();
		if( con != null) con.close();
	} 
 
	
	//
//	response.sendRedirect("index.jsp");
 %>   
    
    
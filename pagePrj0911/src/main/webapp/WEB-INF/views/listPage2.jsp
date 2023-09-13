<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "page.Member" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<% ArrayList<Member> list = (ArrayList<Member>)request.getAttribute("list"); %>


<table>


<tr>
<td>아이디</td>
<td>비밀번호</td>
<td>이름</td>
<td>전화번호</td>
<td>생일</td>
<td>포인트</td>
<td>등급</td>
</tr>


<% for ( Member m : list ) { %>
<tr>
<td><%= m.getM_id() %></td>
<td><%= m.getM_pw() %></td>
<td><%= m.getM_name() %></td>
<td><%= m.getM_tel() %></td>
<td><%= m.getM_birthday() %></td>
<td><%= m.getM_point() %></td>
<td><%= m.getM_grade() %></td>
</tr>
<% } %>
</table>

<%  
	
	// 구해야 할 것
	int totalPage = 0;		// 전체페이지수
	int currentGrp = 0;		// 현재페이지에 대한 현재그룹 구하기
	int grpStartPage = 0;	// 그룹시작페이지
	int grpEndPage = 0;		// 그룹마지막페이지
	//int grpSize = 0;		// 그룹마지막페이지

	Integer totalCnt  =  (Integer) request.getAttribute("totalCnt"); 
    Integer pageSize  =  (Integer) request.getAttribute("pageSize");
    Integer p   =        (Integer) request.getAttribute("page");
    Integer grpSize = 	(Integer) request.getAttribute("grpSize");
    
    
    /*out.println( totalCnt);
    out.println( pageSize);
    out.println( p);
    out.println( grpSize);*/
    
    // 전체페이지 수 
    int remain =totalCnt %pageSize ;
    if(remain ==0){
 	   totalPage  = totalCnt /pageSize ;
    }else{
 	   totalPage  = totalCnt /pageSize +1;
    }
    
    
    //현재그룹 구하기 , 현재페이지를 기준으로 현재그룹구하기
    int remain2 = p % grpSize;
    
    if( remain2 ==0){
 	  currentGrp =    p  / grpSize; 
    }else{
 	   currentGrp =   p  / grpSize +1; 
    }
    
    
    grpStartPage = (currentGrp-1)*grpSize +1 ;
    grpEndPage =   currentGrp*grpSize ;
    
     if( grpEndPage > totalPage){
     	grpEndPage=totalPage;
     } 
     
     int index  = grpStartPage;
     while( index <= grpEndPage){  
    %>
        <a href="/pagePrj0911/list2.page?p=<%=index%>"> [ <%=index%> ] </a>
    <%
     	//out.println(index);
     	index++;
     }
 %>
    



</body>
</html>
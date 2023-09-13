package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fighting")
public class Ex07_실습 extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");   //서버가 보내는 데이터의 형식   html형식임을 알려줌   "tet/plain", plain으로 하면 순수한 텍스트 문서로 뜬다
		response.setCharacterEncoding("utf-8");  //utf-8형식으로 데이터를 보낸다는 의미
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Insert title here</title>");
		out.println("</head>");
		out.println("<body>");
	
		out.print("<h2>다들 힘내 보아요 ☆*: .｡. o(≧▽≦)o .｡.:*★</h2>");
		
		out.println("<img src=\"\">");
		out.println("<a href=\"\"");
		out.println("</body>");
		
		
	}
	
}
		
		




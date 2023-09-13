package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/randomimg")
public class Ex10_실습 extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//Math.random()은 0~1사이의 임의의 실수가 나옴
		int num = (int)(Math.random()*4)+1;      // 0~ 1미만 사이의 임의의 실수  0 , 0.1 *4   , 0.5*4 2.2  0.9*4 3.2 
		System.out.println(num);
		
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
	
		out.print("<h2>실습10</h2>");
		
		if(num==1) {
		out.println("<img src=\"/prj/img/img3.jpg\">");
		}
		else if(num==2) {
			out.println("<img src=\"/prj/img/img4.jpg\">");
		}
		else if(num==3) {
			out.println("<img src=\"/prj/img/img5.jpg\">");
		}
		else if(num==4) {
			out.println("<img src=\"/prj/img/img6.jpg\">");
		}
		out.println("<a href=\"\"");
		out.println("</body>");
		
		
	}
	
}
	


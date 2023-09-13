package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/yaksu")
public class Ex06_실습 extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		String su1_ = request.getParameter("su1");
		
		int su1 = Integer.parseInt(su1_);

		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Insert title here</title>");
		out.println("</head>");
		out.println("<body>");
		
		for(int i=1; i<=su1; i++) {
			if(su1 % i == 0) {
				out.print("<h2>"+su1/i+"</h2>");
			}
			else {
				continue;
			}
		}
		
		out.println("<img src=\"\">");
		out.println("<a href=\"\"");
		out.println("</body>");
		
		
	}
	
}
		
		




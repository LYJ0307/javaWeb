package prj;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cal")
public class Ex01_실습 extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		String su1_ = request.getParameter("su1");
		String su2_ = request.getParameter("su2");
		
		
		int su1 = Integer.parseInt(su1_);
		int su2 = Integer.parseInt(su2_);
		
		
		int sum = su1+su2;
		int divide = su1/su2;
		int multi = su1*su2;
		int minus = su1-su2;
		
		PrintWriter out = response.getWriter();
		out.println(sum);
		out.println(divide);
		out.println(multi);
		out.println(minus);
		
		
	}
	
}

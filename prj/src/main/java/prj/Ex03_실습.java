package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/random99dan")
public class Ex03_실습 extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		String su1_ = request.getParameter("su1");
		
		
		int su1 = Integer.parseInt(su1_);
		
		
		PrintWriter out = response.getWriter();
		
		for(int i=su1; i<=su1; i++) {
			for(int j=1; j<=9; j++) {
				out.println(su1+" * " + j + " = "+ su1*j);
			}
		}
		
		
	}
	
}

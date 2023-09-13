package prg0831;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/mvc3")
public class MVCServlet3 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		//model 얻어오기
		
		ServiceMVC3 s = new ServiceMVC3();
		String[] result = s.getFavorites();
		
		//view forward
		
		req.setAttribute("likes", result);
		req.getRequestDispatcher("WEB-INF/views/mvc3.jsp").forward(req, res);
		
		
	}
	
	
}

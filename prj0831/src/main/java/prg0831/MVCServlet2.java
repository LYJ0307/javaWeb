package prg0831;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/mvc2")
public class MVCServlet2 extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ServiceMVC2 service = new ServiceMVC2();
		//model
		String result = service.getMessage();
		
		
		request.setAttribute("r", result); //r은 키의 의미
		request.getRequestDispatcher("WEB-INF/views/mvc2.jsp").forward(request, response);
		
	}
	
	
}

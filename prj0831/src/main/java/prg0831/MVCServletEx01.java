package prg0831;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/song")
public class MVCServletEx01 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		
		//model 얻어오기
		
		
		ServiceMVC6 s = new ServiceMVC6();
		String[] song = s.getSong();
		
		
		//view forward
		
		
		req.setAttribute("song", song);
		req.getRequestDispatcher("WEB-INF/views/Ex01.jsp").forward(req, res);
		
		
	}
}

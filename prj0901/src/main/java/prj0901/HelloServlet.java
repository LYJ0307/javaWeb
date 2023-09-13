package prj0901;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi")
public class HelloServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		// 모델 Serviece
		HelloService s = new HelloService();
		String message = s.getMessage();
		
		//모델 심기
		req.setAttribute("msg", message);
		req.getRequestDispatcher("WEB-INF/views/HiView.jsp").forward(req, res);
		
	}
	
	

}

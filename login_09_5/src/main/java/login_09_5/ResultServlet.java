package login_09_5;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/result")
public class ResultServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String flower = req.getParameter("flower");
		
		
		//좋아하는 동물 정보
		HttpSession session = req.getSession();
		String animal = (String)session.getAttribute("animal");
		
		System.out.println( animal);
		//데이터 심기
		//좋아하는 꽃 정보
		req.setAttribute("flower", flower);
		req.setAttribute("animal", animal);
		
		req.getRequestDispatcher("WEB-INF/views/result.jsp").forward(req, res);
		
	}
	
}

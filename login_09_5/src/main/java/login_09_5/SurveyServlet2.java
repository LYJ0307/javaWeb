package login_09_5;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/survey2")
public class SurveyServlet2 extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String animal = req.getParameter("animal");
		//사용자가 선택한 animal 정보 세션에 저장하기
		
		
		//1. 세션객체 얻어오기
		HttpSession session =	req.getSession();
		
		//2. 세션에 저장하기
		session.setAttribute("animal", animal);
		req.getRequestDispatcher("WEB-INF/views/survey2.jsp").forward(req, res);
}
	
}

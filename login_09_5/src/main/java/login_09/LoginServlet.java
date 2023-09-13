package login_09;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
			req.getRequestDispatcher("WEB-INF/views/login1.jsp").forward(req, res);
	
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		//로그인 처리, 사용자인지 확인해야 함, 서비스인지
		
		//아이디와 비번이 동일하면 정상 로그인
		//아니면 다시 로그인 화면으로
		
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		
		System.out.println( id);
		System.out.println( pwd);
		
		
		//아이디와 비번이 동일하면 정상 로그인으로 간주
		if (id.equals(pwd)) {
			// 메인 페이지로 이동
			//로그인 성공시 ==> 세션 저장소에 아이디를 저장해 놓음
			HttpSession session = req.getSession();
			session.setAttribute("id", id);
			
			res.sendRedirect("/login_09_5/home1");
			
			
		} else {
			//로그인 화면으로
			res.sendRedirect("/login_09_5/login");
		}

	}
	
	
	
}

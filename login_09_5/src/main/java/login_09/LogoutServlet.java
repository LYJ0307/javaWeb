package login_09;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logOut")
public class LogoutServlet extends HttpServlet {
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		HttpSession session = req.getSession();
		//세션객체 제거함
		//session.invaildate();
		session.invalidate();
		
		res.sendRedirect("/login_09_5/home1");
		
		 
		
	}
	
	

}

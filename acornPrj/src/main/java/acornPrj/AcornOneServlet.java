package acornPrj;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/acorntblone")
public class AcornOneServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//모델 얻어오기
		ServiceAcorn s = new ServiceAcorn();
		Member member = s.getMember();
		
		req.setAttribute("member", member);
		req.getRequestDispatcher("WEB-INF/views/one.jsp").forward(req, resp);
		
		
	}
	
	
}

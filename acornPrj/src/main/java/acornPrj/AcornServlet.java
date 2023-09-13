package acornPrj;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/acorntbl")
public class AcornServlet extends HttpServlet{
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		//모델 얻어오기
		ServiceAcorn s = new ServiceAcorn();
		ArrayList<Member> list = s.getList2();
		
		
		//모델 심기
		req.setAttribute("list", list);
		req.getRequestDispatcher("WEB-INF/views/student.jsp").forward(req, resp);
	}

}

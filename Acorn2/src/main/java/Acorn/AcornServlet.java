package Acorn;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/acorn")
public class AcornServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AcornService service = new AcornService();
		ArrayList<Member> list = service.getList();
		
		
		//모델 심기
		req.setAttribute("list", list);
		req.getRequestDispatcher("WEB-INF/views/acorn.jsp").forward(req, resp);
	}

}

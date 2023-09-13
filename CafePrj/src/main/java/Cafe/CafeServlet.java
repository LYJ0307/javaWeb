package Cafe;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cafemenu")//맵핑 하기
public class CafeServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CafeService service = new CafeService();
		ArrayList<Cafe> list = service.getRealList();
		
		
		//모델 심기
		req.setAttribute("list", list);
		req.getRequestDispatcher("WEB-INF/views/cafe.jsp").forward(req, resp);
		
	}

}

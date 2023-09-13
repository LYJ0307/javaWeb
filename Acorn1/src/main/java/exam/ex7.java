package exam;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/elexam7")
public class ex7 extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<Coffee> coffes = new ArrayList<>();
		coffes.add(new Coffee("c001", "아메리카노", 2000));
		coffes.add(new Coffee("c002", "카페라떼", 5000));
		coffes.add(new Coffee("c003", "초코라떼", 5500));
		coffes.add(new Coffee("c004", "바닐라라떼", 6000));
		req.setAttribute("coffee", coffes);
		req.getRequestDispatcher("WEB-INF/exam/ex7.jsp").forward(req, resp);
	}
}


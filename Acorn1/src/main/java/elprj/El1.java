package elprj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/el1")
public class El1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		//
		req.setAttribute("data", "hi el"); // hi el이 두 번 나옴
		req.getRequestDispatcher("WEB-INF/views/el1.jsp").forward(req, resp);
	}
	
}

package acorn;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/acornReg")
public class RegServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		req.getRequestDispatcher("WEB-INF/views/joinus.jsp").forward(req, resp);
		
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//사용자 정보 가져오기
		//Customer 객체 만들기
		//서비스의 registerCustomer() 매서드 호출하기
		//홈 화면으로 sendRedirect()
		
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		
		//PrintWriter out = resp.getWriter();
		//out.println( name);
		
		Customer c = new Customer(id, pw, name);
		AcornService service = new AcornService();
		
		try {
			//여기서 오류가 발생하면 catch 블록으로 감
			service.registerCustomer(c);
			req.getRequestDispatcher("WEB-INF/views/regOk.jsp").forward(req, resp);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			req.getRequestDispatcher("WEB-INF/views/dberr.jsp").forward(req, resp);
		}
		
		
		
	 
		
	}
	
	
}

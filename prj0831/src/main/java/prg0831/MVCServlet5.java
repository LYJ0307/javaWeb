package prg0831;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/members")
public class MVCServlet5 extends HttpServlet {

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		//Model 얻어오기
		ServiceMVC5 s = new ServiceMVC5();
		ArrayList<Member> list = s.getList();
		
		//Model 심기
		req.setAttribute("list", list);
		req.getRequestDispatcher("WEB-INF/views/acornlist.jsp").forward(req, res);
		
	}
	
}

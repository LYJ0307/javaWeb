package prj0901;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cafeservlet")
public class CafeServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res)  throws ServletException, IOException {
		
		
		//Model
		CafeService cc = new CafeService();
		ArrayList<String> list = cc.MemberList();
		System.out.println(list);
		
		
		//model 심기
		req.setAttribute("list", list);
		req.getRequestDispatcher("WEB-INF/views/coffeemenu.jsp").forward(req, res);
		
		
		
		
	}
	
}

package prj0901;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/acorn")
public class AcornServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		//Model
		//
		AcornService s = new AcornService();
		//ArrayList<String> list = s.getMemberList();
		ArrayList<String> list = s.getMemberRealList();	
		System.out.println(list);
		
		//model 심기
		req.setAttribute("list", list);
		req.getRequestDispatcher("WEB-INF/views/acorn.jsp").forward(req, res);
		
	}
	
}

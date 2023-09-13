package prj0901;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// update?id=mj&newpw=7777

@WebServlet("/update")
public class AcornServletUpdate extends HttpServlet {

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException { {
		
		String id = req.getParameter("id");
		String newpw = req.getParameter("newpw");
		
		
		//처리
		//model (서비스, dao)
		AcornService s = new AcornService();
		Customer c = new Customer(id, newpw);
		s.modifyMember(c);
		
		
		// view 응답
		//
		req.getRequestDispatcher("WEB-INF/views/update.jsp").forward(req, res);
		
	}
	
	
	}
}

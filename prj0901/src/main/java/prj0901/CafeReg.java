package prj0901;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cafereg")
public class CafeReg extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) {
		
		
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String price = req.getParameter("price");
		
		
	}
	
}

package page;

import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.logging.Handler;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/coffee.page")
public class ListPageServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String p = req.getParameter("p");
		int currentPage = 1;
		
		
		if(p != null) {
			currentPage = Integer.parseInt( p);
		}
		
		MenuDAO dao = new MenuDAO();
		int totRecords = dao.getTotalCnt();
		int pageSize = 2;
		int grpSize = 4;	// [1]	[2]	[3]	[4]	[다음]
		
		
		PageHandler handler = new PageHandler(currentPage, totRecords, pageSize, grpSize);
		ArrayList<Menu> list = dao.getListPage(currentPage, pageSize);
		
		req.setAttribute("list", list);
		req.setAttribute("handler", handler);
		
		
		req.getRequestDispatcher("WEB-INF/views/listPage3.jsp").forward(req, resp);
		
		
		
	}

}

package ajaxPrj_cafe;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

@WebServlet("/cafe01")
public class CafeServlet5 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charest=utf-8");
		
		CafeService service = new CafeService();
		JSONArray array = service.getCafeRealList();
		
		System.out.println(array);
		resp.getWriter().println( array);
		
	}

}

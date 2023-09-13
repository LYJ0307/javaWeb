package ajaxPrj_cafe;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import netscape.javascript.JSObject;

@WebServlet("/cafe3")
public class CafeServlet2 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		Cafe cafe = new Cafe("c300","바닐라라떼", 4500);
		JSONObject object = new JSONObject();
		object.put("name", cafe.getName());
		object.put("price", cafe.getPrice());
		
		resp.getWriter().println( object);
		
	}
	

}

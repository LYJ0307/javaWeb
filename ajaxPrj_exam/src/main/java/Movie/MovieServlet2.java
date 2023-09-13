package Movie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

@WebServlet("/Movie2")
public class MovieServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		Movie movie = new Movie("타겟", "박희곤", "101분");
		JSONObject o = new JSONObject();
		o.put("name", movie.getName());
		o.put("supervise", movie.getSupervise());
		o.put("runtime", movie.getRuntime());
		
		resp.getWriter().println( o);
		
	}
	
}

package prg0831;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/movies")
public class MVCServlet4 extends HttpServlet {
	
	
		//Model 만들기
		//
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			
			ServiceMVC4 s = new ServiceMVC4();
			ArrayList<String> list = s.getMovies();
			
			
			//모델 심기
			req.setAttribute("movies", list);
			
			
			req.getRequestDispatcher("WEB-INF/views/movie.jsp").forward(req, res);
			
		}
		
		
	
	
}

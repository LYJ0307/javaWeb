package exam;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.net.TLSClientHelloExtractor;


@WebServlet("/login")
public class login extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//session 저장소 값을 저장하고, 꺼내오는 것
		HttpSession session = req.getSession();
		session.setAttribute("id", "acorn01");
		
		
		req.getRequestDispatcher("WEB-INF/exam/login.jsp").forward(req, resp);;
	
		
	}
}

package exam;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.net.TLSClientHelloExtractor;


@WebServlet("/elexam12")
public class EL2 extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setAttribute("hi", "hello");
		req.getRequestDispatcher("WEB-INF/exam/el2.jsp").forward(req, resp);
	}
}

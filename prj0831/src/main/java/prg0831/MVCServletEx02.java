package prg0831;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/bucketlist")
public class MVCServletEx02 extends HttpServlet {
		
	
	//Model 만들기
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		ServiceBucket b = new ServiceBucket();
		ArrayList<String> list = b.getlist();
		
		
		
		//모델 심기
		req.setAttribute("bucketlist", list);
		
		
		req.getRequestDispatcher("WEB-INF/views/buketlist.jsp").forward(req, res);
		
		
	}
	
	
}

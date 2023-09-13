package prg0831;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mvcmessage")
public class MVCMessage extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		//Model, 데이터
		String message = "내일은 금요일";
		
		
		//req를 저장소로 사용함 (MVC)
		//request 저장소에 model 심기
		
		req.setAttribute("msg", message);
		req.getRequestDispatcher("WEB-INF/views/msg.jsp").forward(req, res);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	}
	
	
	

}

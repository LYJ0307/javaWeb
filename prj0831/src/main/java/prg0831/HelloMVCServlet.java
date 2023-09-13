package prg0831;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/himvc")
public class HelloMVCServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		
		
		//입력정보 추출
		
		
		//모델 : 데이터를 만드는 일
		
		//응답view 처리 흐름을 forward 시킨다
		
		
		RequestDispatcher r =request.getRequestDispatcher("WEB-INF/views/HelloView.jsp");
		r.forward(request, response);		// 기본적으로 제공되는 코드, 뷰를 거쳐가는 코드
		
	}
}

package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//서블릿의 시작이 service 매서드이다
public class SecondServlet extends HttpServlet{
	@Override										//응답정보
	protected void service(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("second servlet");
		PrintWriter out = response.getWriter();		// 응답할 출력스트림 가져오기
		out.println("hi second servlet!!!!");
	}
}

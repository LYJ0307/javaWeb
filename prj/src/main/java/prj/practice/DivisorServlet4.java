package prj.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/divisor4")
public class DivisorServlet4  extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		
		  //약수구하기				
		int su  =  Integer.parseInt( request.getParameter("su") );		
		MyUtils utils = new MyUtils();
		String divisors = utils.getDivisor(su);
		
		
		System.out.println( divisors);		
		PrintWriter out  = response.getWriter();
		out.println( divisors);
		
		
		
	}

}
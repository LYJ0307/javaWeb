package acorn;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("*.do")
public class Filter2  implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {		 
		
		System.out.println(" filter 2");
		//
		HttpServletRequest h_request = (HttpServletRequest) request;
		HttpServletResponse h_Response = (HttpServletResponse) response ;
		HttpSession session = h_request.getSession();
		
		
		if ( session.getAttribute("id") != null) {
			// 요청한 서블릿으로 넘어감
			System.out.println("before");
			chain.doFilter(request, response);
		} else {
			System.out.println("after");
			String path = h_request.getContextPath();
			h_Response.sendRedirect(path + "/login");
		}
		
		
		
	}

}

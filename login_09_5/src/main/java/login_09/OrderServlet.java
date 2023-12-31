package login_09;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		//주문요청시
		//로그인 상태 확인 후 주문 정보를 보여주거나 아니면 로그인 화면으로 이동
		
		
		//세션저장소에서 id값을 확인 후 로그인 상태 여부 확인
		HttpSession session = req.getSession();
		String id = (String)session.getAttribute("id");
		
		
		if(id != null) { // 로그인 상태이면 주문페이지가 응답될 수 있도록 한다.
			

			req.getRequestDispatcher("WEB-INF/views/order1.jsp").forward(req, res);
			
					
		} else { 
			
			// 로그인 화면으로 이동
			
			//해당 고객의 주문 목록 가져오기
			//서비스, dao
			
			
			res.sendRedirect("/login_09_5/login");
			
			
		}
		
	}
	
	
}

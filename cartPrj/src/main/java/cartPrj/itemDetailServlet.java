package cartPrj;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/itemDetail")
public class itemDetailServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		//상품정보 가져오기
		//서비스, dao
		String code = req.getParameter("code");
		
		//모델심기
		ItemService s = new ItemService();
		String item = s.getITem(code);
		
		req.setAttribute("item", item);
		req.getRequestDispatcher("WEB-INF/views/itemDetails.jsp").forward(req, res);
		
}
}

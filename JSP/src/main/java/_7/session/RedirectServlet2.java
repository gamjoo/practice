package _7.session;

import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ex1/_7.session/SessionServlet")
public class RedirectServlet2 extends HttpServlet {

	private static final long serialVersionUID = 7169827635891554734L;

	public RedirectServlet2() {
		super();
	}
	
	//Redirect 방식 : 포워딩될 때 브라우저의 주소 표시줄의 URL이 변경되므로 요청이 바뀐다
	//이동된 jsp페이지에서는 서블릿에서 request 영역의 공유한 속성 값에 접근할 수 없다.
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		
		//request.getSession() : 세션 객체를 가져 온다.
		HttpSession session = request.getSession();
		
		String value = request.getParameter("food");
		request.setAttribute("food",value); //request 객체에 저장
		session.setAttribute("food", value);//session 객체에 저장
		
		response.sendRedirect("redirect.jsp");
		
	}
}

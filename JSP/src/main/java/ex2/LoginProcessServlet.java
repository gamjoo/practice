package ex2;

import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ex2_jsp/_2.include_ex_3/loginProcess")
public class LoginProcessServlet extends HttpServlet {

	private static final long serialVersionUID = -7308606164437734602L;
	
	public LoginProcessServlet() {
		super();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//request.getSession() : 세션 객체를 가져 온다.
		HttpSession session = request.getSession();
		
		String value = request.getParameter("id");
		session.setAttribute("id", value);//session 객체에 저장
		
		response.sendRedirect("template.jsp");
		
	}
}

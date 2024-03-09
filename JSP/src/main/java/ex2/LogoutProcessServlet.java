package ex2;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ex2_jsp/_2.include_ex_3/logout")
public class LogoutProcessServlet extends HttpServlet {

	private static final long serialVersionUID = -7308606164437734602L;
	
	public LogoutProcessServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		session.invalidate(); //세션의 모든 속성 삭제
		
		//session.removeAttribute("id") //특정 속성에 대해 제거
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<script>");
		out.println("alert('로그아웃 되었습니다.');");
		out.println("location.href='template.jsp'");
		out.println("</script>");
		out.close();
		
		
	}
}

package _5.dispatcher;

import java.io.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//http://localhost:8088/JSP/ex1/_5.dispatcher/DispacherServlet
@WebServlet("/ex1/_5.dispatcher/DispatcherServlet")
public class DispatcherServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1152344334273371547L;

	public DispatcherServlet() {
		super();
	}
	
	/* 페이지 이동 방법
	 * Dispatcher 방식
	 *   -클라이언으로부터 요청 받은 Servlet 프로그램이 응답을 하지 않고
	 *    다른 서블릿이나 JSP 페이지 등에 요청을 전달한다. (요청 재지정)
	 *   -이 방식으로 이동하면 주소 표시줄의 주소가 변경되지 않는다.
	 *   -request 영역을 공유하게 된다
	 *   -방법 : RequestDispatcher에서 제공하는 메소드(forward())를 사용하여
	 *          요청을 재지정 한다.
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		
		System.out.println("요청방식 : " + request.getMethod());
		System.out.println("파라미터 food의 값 : " + request.getParameter("food"));
		
		//dispatcher.jsp : 이동할 페이지 주소
		//http://localhost:8088/JSP/dispatcher.jsp의 의미
		//RequestDispatcher dispatcher = request.getRequestDispatcher("/dispatcher.jsp");
		
		//http://localhost:8088/JSP/ex1/_5.dispatcher/dispatcher.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("dispatcher.jsp");
		//이동한다.
		dispatcher.forward(request, response);
	}
}

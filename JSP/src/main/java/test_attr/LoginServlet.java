package test_attr;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import java.io.IOException;


@WebServlet("/ex1/test_attr/send")
public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 8848926233399998496L;

	public LoginServlet() {
		super();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		
		String value = request.getParameter("id");
		request.setAttribute("id", value);
		
		value = request.getParameter("pass");
		request.setAttribute("pass", value);
		
		value = request.getParameter("jumin1");
		request.setAttribute("jumin1", value);
		
		value = request.getParameter("jumin2");
		request.setAttribute("jumin2", value);
		
		value = request.getParameter("email");
		request.setAttribute("email", value);
		
		value = request.getParameter("domain");
		request.setAttribute("domain", value);
		
		String[] values = request.getParameterValues("gender");
		for (int i=0; i<values.length; i++) {
			if (values[i].equals("m")) {
				value = "남자";
			} else if (values[i].equals("f")) {
				value = "여자";
			}
		}
		request.setAttribute("gender", value);
		
		
		value = request.getParameter("post1");
		request.setAttribute("post1", value);
		
		value = request.getParameter("address");
		request.setAttribute("address", value);
		
		value = request.getParameter("intro");
		request.setAttribute("intro", value);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("send.jsp");
		dispatcher.forward(request, response);
	}
}
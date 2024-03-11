package net.template.action;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.net")
public class TemplateFrontController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
//	protected void doProcess(HttpServletRequest request,
//	HttpServletResponse response);
	
	//doProcess(request,response)메소드를 구현하여 요청이 GET방식이든
	//POST방식으로 전송되어 오든 같은 메소드에서 요청을 처리할 수 있도록 작업
	protected void doGet(HttpServletRequest request,
	HttpServletResponse response) throws ServletException, IOException {
//		doProcess(request, response);
	String RequestURI = request.getRequestURI();
	String ContextPath = request.getContextPath();
	int ContextPathleng = ContextPath.length();
	String command = RequestURI.substring(ContextPathleng);
	System.out.println(ContextPathleng);
	System.out.println("RequestURI = " + RequestURI);
	System.out.println("contextPath = " + ContextPath);
	System.out.println("command = " + command);
	}
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
//		doProcess(request, response);
	}
}
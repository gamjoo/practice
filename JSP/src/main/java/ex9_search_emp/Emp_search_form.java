package ex9_search_emp;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/emp_search_form")
public class Emp_search_form extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request,
	HttpServletResponse response) throws ServletException, IOException{
		
		RequestDispatcher dispatcher
		 = request.getRequestDispatcher("/ex8_db/_3.search/input_emp.jsp");//view
		dispatcher.forward(request, response);
	}
}
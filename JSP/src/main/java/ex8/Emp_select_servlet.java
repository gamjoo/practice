package ex8;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/emp_select")
public class Emp_select_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request,
	HttpServletResponse response) throws ServletException, IOException{
		
		DAO_emp dao_emp = new DAO_emp();
		ArrayList<Emp> list = dao_emp.selectAll();
		
		RequestDispatcher dispatcher
		 = request.getRequestDispatcher("/ex8_db/_2.list/list_emp.jsp");//view
		request.setAttribute("list_emp", list);
		dispatcher.forward(request, response);
	}
}

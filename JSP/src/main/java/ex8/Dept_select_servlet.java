package ex8;

import java.io.IOException;
import java.util.ArrayList;

import ex8_search.DAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/dept_select")
public class Dept_select_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request,
	HttpServletResponse response) throws ServletException, IOException{
		
		DAO dao = new DAO();
		ArrayList<Dept> list = dao.selectAll();
		
		RequestDispatcher dispatcher
		 = request.getRequestDispatcher("/ex8_db/_2.list/list.jsp");//view
		request.setAttribute("list", list);
		dispatcher.forward(request, response);
	}
}

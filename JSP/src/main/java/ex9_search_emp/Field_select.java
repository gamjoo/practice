package ex9_search_emp;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/field_select")
public class Field_select extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public Field_select() {
		super();
	}
	
	protected void doGet(HttpServletRequest request,
	HttpServletResponse response) throws ServletException, IOException{
		int field = Integer.parseInt(request.getParameter("field"));
		System.out.println(field);
		String search = request.getParameter("search");
		System.out.println(search);
		
		DAO dao = new DAO();
		ArrayList<Emp> list = dao.select(field, search);
		RequestDispatcher dispatcher
//		 = request.getRequestDispatcher("/ex8_db/_2.list.emp/list.jsp");//view
		 = request.getRequestDispatcher("/ex8_db/_2.list.emp/list_el.jsp");
		request.setAttribute("list", list);
		dispatcher.forward(request, response);
	}
}
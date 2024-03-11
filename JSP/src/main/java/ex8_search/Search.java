package ex8_search;

import java.io.IOException;
import java.util.ArrayList;

import ex8.Dept;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public Search() {
		super();
	}
	
	protected void doGet(HttpServletRequest request,
	HttpServletResponse response) throws ServletException, IOException{
		DAO dao = new DAO();
		int deptno = Integer.parseInt(request.getParameter("deptno"));
		ArrayList<Dept> list = dao.select(deptno);
		RequestDispatcher dispatcher
		 = request.getRequestDispatcher("/ex8_db/_2.list/list.jsp");//view
		request.setAttribute("list", list);
		dispatcher.forward(request, response);
	}
}

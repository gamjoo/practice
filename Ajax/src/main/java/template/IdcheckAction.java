package template;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/idcheck")
public class IdcheckAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		
		DAO dao = new DAO();
		
		//result가 0인 경우는 아이디가 존재하지 않는 경우
		//result가 -1인 경우는 아이디가 존재하는 경우
		int result = dao.isId(id);
		System.out.println(result);
		response.getWriter().print(result);
	}

}

package _6.getJSON;

import java.io.IOException;

import com.google.gson.JsonArray;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/get_dept_lib")
public class Get_dept_lib extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request,
	HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("application/json;charset=utf-8");
		
		DAO dao = new DAO();
		JsonArray array = dao.getArray();
		
		System.out.println(array);
		response.getWriter().print(array); 
		//[{"deptno":"10", "dname":"ACCOUNTING", "loc":"NEW YORK"},
		// {"deptno":"20", "dname":"RESEARCH", "loc":"DALLAS"},...]
		
	}
	

}

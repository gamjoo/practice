package org.hta.emp.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hta.emp.controller.Action;
import org.hta.emp.controller.ActionForward;
import org.hta.emp.dao.EmpDAO;
import org.hta.emp.domain.Emp;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CheckCount implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//선택없이 보내면 deptnos는 null이다.
		String deptnos[] = request.getParameterValues("deptno");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("deptnos", deptnos);
		
		EmpDAO dao = new EmpDAO();
		List<Emp> list = dao.getCheck(map);
		//List에 Map을 담을 수도 있다.
		List<Map<String, Integer>> listcount = dao.getCount(map);
		Set set = listcount.get(0).keySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println("KEY : " + key);
		}
		
		ActionForward forward = new ActionForward();
		request.setAttribute("listcount", listcount);
		request.setAttribute("list", list);
		request.setAttribute("deptnos", map.get("deptnos"));
		forward.setPath("_2.foreach/listcount.jsp");
		forward.setRedirect(false);
		return forward;
	}

}

package org.hta.emp.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hta.emp.controller.Action;
import org.hta.emp.controller.ActionForward;
import org.hta.emp.dao.EmpDAO;
import org.hta.emp.domain.Emp;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Term2 implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//name 속성 자체가 없으면 null 이지만, name을 통해 온 값이 없으면 "" 빈문자열
		//startday, endday를 선택하지 않은 경우
		//request.getParameter("startday") -> ""
		//request.getParameter("endday") -> ""
		Map<String, String> m = new HashMap<>();
		m.put("start", request.getParameter("startday"));
		m.put("end", request.getParameter("endday"));
		
		EmpDAO dao = new EmpDAO();
		List<Emp> list = dao.getTermList2(m);
		
		ActionForward forward = new ActionForward();
		request.setAttribute("list", list);
		request.setAttribute("start", m.get("start"));
		request.setAttribute("end", m.get("end"));
		forward.setPath("_1.where/list1.jsp");
		forward.setRedirect(false);
		return forward;
	}

}

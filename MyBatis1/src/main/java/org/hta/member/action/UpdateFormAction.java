package org.hta.member.action;

import java.io.IOException;

import org.hta.member.controller.Action;
import org.hta.member.controller.ActionForward;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateFormAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("jsp/updateForm.jsp");
		return forward;
	}

}

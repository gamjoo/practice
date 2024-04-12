package org.hta.member.controller;

import java.io.IOException;

import org.hta.member.action.DeleteAction;
import org.hta.member.action.JoinFormAction;
import org.hta.member.action.JoinProAction;
import org.hta.member.action.ListAction;
import org.hta.member.action.LoginFormAction;
import org.hta.member.action.LoginproAction;
import org.hta.member.action.LogoutAction;
import org.hta.member.action.MainAction;
import org.hta.member.action.UpdateFormAction;
import org.hta.member.action.UpdateProAction;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.net")
public class FrontController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doProcess(HttpServletRequest request,
	HttpServletResponse response) throws ServletException, IOException {
		System.out.println("요청 주소: " + request.getRequestURL());
/*
 * 요청된 전체 URL 중에서 포트 번호 다음부터 마지막 문자열까지 반환된다.
 * eg) httt://localhost:8088/JspProject/BoardList.bo인 경우
 * 	   "/JspProject/BoardList.bo" 반환된다.
 */
		String RequestURI = request.getRequestURI();
		System.out.println("RequestURI = " + RequestURI);
		
		//getContextPath() : 컨텍스트 경로가 반환된다.
		//contextPath는 "/JspProject"가 반환된다.
		String contextPath = request.getContextPath();
		System.out.println("contextPath = " + contextPath);
		
		//RequestURI에서 컨텍스트 경로 길이 값의 인덱스 위치의 문자부터
		//마지막 위치의 문자까지 추출한다
		//command는 "/BoardList.bo" 반환된다
		String command = RequestURI.substring(contextPath.length());
		System.out.println("command = " + command);
		
		//초기화
		ActionForward forward = null;
		Action action = null;
		
		switch (command) {
			case "/main.net":
				action = new MainAction();
				break;
			case "/loginForm.net":
				action = new LoginFormAction();
				break;
			case "/loginPro.net":
				action = new LoginproAction();
				break;
			case "/joinForm.net":
				action = new JoinFormAction();
				break;
			case "/joinPro.net":
				action = new JoinProAction();
				break;
			case "/logout.net":
				action = new LogoutAction();
				break;
			case "/list.net":
				action = new ListAction();
				break;
			case "/delete.net":
				action = new DeleteAction();
				break;
			case "/updateForm.net":
				action = new UpdateFormAction();
				break;
			case "/updatePro.net":
				action = new UpdateProAction();
				break;
				
		} //switch (command)
		
		forward = action.execute(request, response);
		
		if (forward != null) {
			if (forward.isRedirect()) {//리다이렉트 된다.
				response.sendRedirect(forward.getPath());
			} else { //포워딩된다.
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}//if (forward != null)
	} //doProcess
	
	//doProcess(request,response)메소드를 구현하여 요청이 GET방식이든
	//POST방식으로 전송되어 오든 같은 메소드에서 요청을 처리할 수 있도록 작업
	protected void doGet(HttpServletRequest request,
	HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
}
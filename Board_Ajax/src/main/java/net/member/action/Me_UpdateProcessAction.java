package net.member.action;

import java.io.IOException;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.common.action.Action;
import net.common.action.ActionForward;
import net.member.db.Member;
import net.member.db.MemberDAO;

public class Me_UpdateProcessAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		MemberDAO mdao = new MemberDAO();
		Member memberdata = new Member();
		ActionForward forward = new ActionForward();
		
		String saveFolder = "memberupload";
		int filesize = 10 * 1024 * 1024;
		ServletContext sc = request.getServletContext();
		String realFolder = sc.getRealPath(saveFolder);
		try {
			MultipartRequest multi = 
					new MultipartRequest(request, realFolder, filesize, "utf-8",
									     new DefaultFileRenamePolicy());
			memberdata.setId(multi.getParameter("id"));
			memberdata.setName(multi.getParameter("name"));
			memberdata.setAge(Integer.parseInt(multi.getParameter("age")));
			memberdata.setGender(multi.getParameter("gender"));
			memberdata.setEmail(multi.getParameter("email"));
			memberdata.setMemberfile(multi.getParameter("count"));

			
			boolean result = mdao.memberupdate(memberdata);
			
			//수정에 실패한 경우
			if(!result) {
				System.out.println("회원정보 수정 실패");
				forward.setRedirect(false);
				request.setAttribute("message", "회원정보 수정에 실패했습니다.");
				forward.setPath("error/error.jsp");
			} else {
			//수정 성공
				System.out.println("회원정보 수정 완료");
				forward.setRedirect(true);
				forward.setPath("login.net");
			}
		} catch (IOException e) {
			e.printStackTrace();
			forward.setPath("error/error.jsp");
			request.setAttribute("message", "회원정보 수정 중 실패입니다.");
			forward.setRedirect(false);
		}
		return forward;
	}
}

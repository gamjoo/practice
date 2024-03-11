package _2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ex1/_2.men/memReg")
public class memRegTest extends HttpServlet {

	private static final long serialVersionUID = -1479553004494192723L;

	protected void doGet(HttpServletRequest request,
						HttpServletResponse response)
					throws ServletException, IOException {
	//응답하는 데이터 타입이 html 타입이고
	//charset=utf-8로 지정하면서 응답되는 데이터들의 한글 처리를 한 부분이다.
	response.setContentType("text/html;charset=utf-8");
	
	//getParameter() 메소드:
	//html의 태그 속성 중에서 "name=id, name-passwd"인 곳에서 입력한후 전송되어 온
	//파라미터 값을 반환해 주는 메소드
	//클라이언트에서 전송되어 오는 id라는 이름의 파라미터 값과
	//passwd라는 이름의 파라미터 값을 받는 부분이다.
	//id=admin&passwd=1111
	String name = request.getParameter("name");
	String addr = request.getParameter("addr");
	String tel = request.getParameter("tel");
	String hobby = request.getParameter("hobby");
	
	//문자열 단위로 response객체에 내용을 출력할 수 있는 출력 스트림을 생성한 부분
	PrintWriter out = response.getWriter();
	
	//getContextPath() : 웹 애플리케이션 경로 정보를 반환한다.
	//URL에서 포트번호와 슬래시 다음이 웹 애플리케이션 이름을 의미하며 이 값을 추출한다.
	out.println("<table><thead>");
	out.println("<tr style='border-bottom:1px solid black'><th>회원명</th><th>"+name+"</th></tr></thead>");
	out.println("<tbody><tr><td>주소</td><td>"+addr+"</td></tr>");
	out.println("<tr><td>전화번호</td><td>"+tel+"</td></tr>");
	out.println("<tr><td>취미</td><td>"+hobby+"</td></tr>");
	out.println("</tbody></table>");
	
	out.close();
	}
	
}

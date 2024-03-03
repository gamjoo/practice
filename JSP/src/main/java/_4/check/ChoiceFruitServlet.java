package _4.check;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ex1/_4.check_values/choiceFruit")
public class ChoiceFruitServlet extends HttpServlet {

	private static final long serialVersionUID = 3195712110528537169L;

	public ChoiceFruitServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
	/*
	1.getParameterValues()
	   예) fruit=apple.png&fruit=grape.png&fruit=strawbeery.png
	   	   &fruit=water-melon.png
	   	하나의 파라미터 이름(fruit)으로 값이 여러 개 전송되어 올 경우에 사용하는 메서드
	   	체크박스의 이름은 공통적으로 fruit로 지정되어 있으므로 각 체크박스의 값으로
	   	과일 이미지 파일명을 지정하여 파리미터 값으로 과일 이미지 이름이 전송되도록 하고 있다
	2.getParameter() : 하나의 파라미터로 하나의 값만 오는 경우 사용하는 메소드
	   	하나의 파라미터 이름(fruit)으로 값이 여러 개 전송되어 올 경우 이 메소드를 사용하면
	   	처음 선택한 값만 알 수 있다.
	   	예) fruit=apple.png&fruit=grape.png&fruit=strawbeery.png
	   	   &fruit=water-melon.png에서
	   	   fruit=apple.png 값을 가져온다
	 */
		
	System.out.println("request.getParameter(\"fruit\") => "
			+ request.getParameter("fruit"));
	String[] f = request.getParameterValues("fruit");
	
	System.out.println("===== 선택한 모든 과일 시작 =====");
	for (String fruit : f) {
		System.out.println(fruit);
	}
	
	System.out.println("===== 선택한 모든 과일 끝 =====");
	
	
	out.println("<html><head>"
			+ "<style>body{background:black;} "
			+ "table{background:yellow;margin:0 auto;text-align:center} "
			+ "tr{border:1px solid black;}"
			+ "td{border:1px solid black;} "
			+ "th{color:red;border:1px solid black;font-size:17pt} "
			+ "img{width:150px;height:150px} "
			+ "</style></head>");
	out.println("<body><table><thead><tr>");
	for (int i=0; i<f.length; i++) {
		out.println("<th>"+f[i]+"</th>");
	}
	out.println("<tbody><tr>");
	for (int i=0; i<f.length; i++) {
		out.println("<td><img src=../image/"+f[i]+"></td>");
	}
	out.println("</tr></tbody>");
	out.println("</thead></table></body></html>");
			

}
}

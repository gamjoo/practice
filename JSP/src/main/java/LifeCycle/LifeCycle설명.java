package LifeCycle;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 1. @은 annotation으로 자바 주석문처럼 소스안에 @기호와 함께 사용한다
 
 2. 주석문처럼 컴파일러에 정보를 알려주는 기능 또는 자바 프로그램 실행에 관한 내용을
 	설정하는 용도로 사용된다.
 	
 3. @WebServlet 설정을 통한 서블릿 접근 방법은 서블릿 3.0부터 지원합니다.
    더 이상 web.xml에 서블릿 매핑에 관한 설정을 할 필요가 없다.
 
 4. @WebServlet 어노태이션은 urlPatterns 속성을 값으로 갖는데 이 속성은
    해당 서블릿과 매핑될 URL 패턴을 지정할 때 사용된다.
    * @WebServlet(urlPatterns="/LifeCycle")의 의미는
      "http://localhost:8088/프로젝트이름/LifeCycle"로 요청이 들어오면
      실행할 서블릿이라는 의미다.
      
 5. urlPatterns은 여러 개의 URL을 설정하기 위해 String 배열을 사용한다.
 	 예) @WebServlet(urlPatterns="/a")
 	 예) @WebServlet(urlPatterns={"/a"})
 	 예) @WebServlet(urlPatterns={"/a", "/b", "/c"})
 */
//@WebServlet(urlPatterns = {"/LifeCycle","/a"})
public class LifeCycle설명 extends HttpServlet {
/*
	1.serialVersionUID는 같은 클래스임을 알려주는 식별자 역할을 하며
	  Serializable 인터페이스를 구현한 클래스를 컴파일하면 자동적으로
	  serialVersionUID 정적 필드가 추가된다.
	 
	2.serialVersionUID는 자바의 직렬화(객체의 데이터를 byte형태의 데이터로 변환하는 기술)와
	  역직렬화(byte로 변환된 데이터를 원래의 객체 데이터로 변환하는 기술) 실행될 때
	  자동으로 부여된다.
	  
	3.역직렬화시 직렬화 가능 클래스의 내용이 그대로이면 같은 번호가 부여되고
	  클래스의 구성요소가 하나라도 바뀌면 완전히 다른 serialVersionUID가 부여된다.
	  이 경우 역직렬화시 오류가 발생한다.
	  
	4.하지만 명시적으로 클래스에 serialVersionUID가 선언되어 있으면
	  컴파일 시 추가되지 않기 때문에 동일한 값을 유지할 수 있다.
	  
  	//private static final long serialVersionUID = 1L;
 */
	private static final long serialVersionUID = -5392537344249361332L;

	public LifeCycle설명() {
		super();
		System.out.println("저는 생성자 입니다.~~");
	}
	/*
	  콜백 메소드(callback method) - 어떤 객체에서 어떤 상황이 발생하면
	  					컨테이너가 자동으로 호출하여 실행되는 메소드를 의미한다
	  					이런 콜백 메소드들이 서블릿을 실행한다.
	  	- init(), service(), destroy()
	   	  init() -> service() -> destroy()
	 */
	/* init() 메소드는 서블릿 객체가 생성된 다음에 호출되는 메소드로
	   클라이언트로부터 최초로 서블릿 요청이 있을 때 1번 실행된다.
	   서블릿 초기화 작업에 사용한다
	 */
	
	public void init() throws ServletException {
		System.out.println("저는 init() 입니다.");
	}
	
	/*
	 - destroy()메서드의 출력 결과를 보기 위해서는
	   LifeCycle.java 파일을 수정한 뒤 저장하고 잠시 뒤에 콘솔을 본다
	 - 서블릿 객체가 메모리에서 삭제될 때 실행된다
	 - 자원 해제 작업 등에 사용된다.
	 */
	public void destroy() {
		System.out.println("저는 destroy()3 입니다.");
	}
	
	/*
	   클라이언트의 요청이 있을 때마다 실행된다.
	   service()메소드가 끝나면 서버에서의 실행은 끝난다.
	   서버 프로그램 실행이 완료된 후에는 서블릿 컨테이너가 실행결과를 웹 서버에 전달하고
	   웹 서버는 서비스를 요청한 클라이언트에 응답한다.
	   이로써 웹에서 하나의 요청에 대한 처리가 완료된다.
	   
	    HTTP메소드를 참조하여 doGet()를 호출할지, doPost()를 호출할지 결정하며
	    요청이 있을 때마다 호출된다.
	    브라우저에서 새로고침을 해보세요.
	 */
	public void service(HttpServletRequest request,
  HttpServletResponse response) throws ServletException, IOException {
	System.out.print("저는 service() 입니다.");
	System.out.println("요청 주소" + request.getRequestURL());
	}
	
}

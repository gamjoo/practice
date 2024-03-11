package ex9_search_emp;
/*
자바빈(JavaBean)은 자바빈 규약에 따라 작성된 자바 클래스이다.
예를 들어 회원 정보, 게시판 글 등의 정보를 출력할 때 정보를 저장하고 있는 자바빈 객체를 사용하게 된다

다음은 자바빈 규약이다.
1.필드마다 별도의 get/set 메소드가 존재해야 한다.
2.get메소드는 파라미터가 존재하지 않아야 한다.
3.set메소드는 반드시 하나 이상의 파라미터가 존재해야 한다.
4.빈즈 컴포넌트의 속성은 반드시 읽기 또는 쓰기가 가능해야 한다.
  단, 읽기 전용인 경우 get 또는 is 메소드만 정의할 수 있다.
5.생성자는 파라미터가 없는 기본 생성자를 반드시 작성해 주어야 한다.
6.필드의 접근 제어자는 private이고 각 set/get 메소드의 접근 제어자는
  public으로 정의되어야 하며 클래스의 접근 제어자는 public으로 정의한다.
  
*자바빈 클래스는 데이터를 저장하는 필드, 데이터를 읽어올 때 사용되는
 메서드(getter메소드), 값을 저장할 때 사용되는 메소드(setter메소드)로 구성된다.
 
*메소드 이름을 사용해서 프로퍼티(property)의 이름을 결정하게 된다.
 예를 들어 프로퍼티의 이름이 name이고 값의 타입이 int인 경우 프로퍼티와 관련된
 메소드의 이름은 다음과 같이 결정된다.
 public void setName(int value){};
 public int getName(){};
 
setName()과 getName()를 통해서 관리하는 데이터를 프로퍼티(property)라고 부른다.

프로퍼티 타입이 boolean인 경우 get대신 is를 붙일 수 있다.

즉, 프로퍼티의 값을 설정하는 메소드의 경우
프로퍼티의 이름 중 첫 글자를 대문자로 변환한 문자열 앞에 set을 붙이고
프로퍼티의 값을 읽어오는 메소드의 경우
프로퍼티의 이름 중 첫 글자를 대문자로 변환한 문자열 앞에 get을 붙인다.
프로퍼티의 이름과 필드의 이름은 같지 않아도 된다.
=> 예를 들어, name 프로퍼티의 값을 실제로 저장하는 필드가 _name인 경우
	private String _name;
	
	public String getName() {
			return _name;
	}
	
	public void setName(String name) {
			_name = name;
	}

*** 데이터 빈(DataBean) 클래스 작성 ***
여러 개의 정보들을 데이터 빈이라는 하나의 객체에 저장하게 되고,
이 객체를 전달하면 각 정보를 하나씩 전달할 필요가 없으며 한번에 모든 정보가 전달된다.
이런 클래스를 DTO(Data Transfer Object), VO(Value Object)라고 한다.
DB에서 만들었던 컬럼명과 동일하게 필드를 생성한다.
*/

import java.sql.Date;

public class Emp {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
	
	public Emp() {
		
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
}
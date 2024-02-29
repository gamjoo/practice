//생성자, 메서드, 정적 필드는 직렬화 대상이 아니다.
//인스턴스 필드는 직렬화 대상이다.
//transient 키워드 : 직렬화에서 제외 시킬 필드를 표시하는 키워드
//실행 순서 : ObjectOutputExample3.java -> ObjectInputExmaple3
package ex19_04_Serializable_interface;
public class BBSItem implements java.io.Serializable {
	private static int itemNum;  //게시물의 수 - 정적 필드는 직렬화 대상 아니다
	private String writer;	     //저자 - 인스턴스 필드는 직렬화 대상이다
	private transient String passwd;		 //비밀번호 - 인스턴스 필드는 직렬화 대상이다
	private String title;		 //제목 - 인스턴스 필드는 직렬화 대상이다
	private String content;		 //내용 - 인스턴스 필드는 직렬화 대상이다
	
	BBSItem (String writer, String passwd, String title, String content) {
		this.writer = writer;
		this.passwd = passwd;
		this.title = title;
		this.content = content;
		itemNum++;
	}
	
	//메소드는 직렬화 대상이 아니다
	void modifyContent(String content, String passwd) {
		if(!passwd.equals(this.passwd))
			return;
		else
			this.content = content;
	}
	
	//메소드는 직렬화 대상이 아니다
	public String toString() {
		return "전체게시물의 수 : " + itemNum +
				"\n글쓴이 : " + writer +
				"\n패스워드 : " + passwd +
				"\n제목 : " + title +
				"\n내용 : " + content ;
	}
}

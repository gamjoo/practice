create table board(
	BOARD_NUM NUMBER, --글 번호
	BOARD_NAME VARCHAR2(30), --작성자
	BOARD_PASS VARCHAR2(30), --비밀번호
	BOARD_SUBJECT VARCHAR2(300), --제목
	BOARD_CONTENT VARCHAR2(4000), --내용
	BOARD_FILE VARCHAR2(50), --첨부될 파일
	BOARD_RE_REF NUMBER, --답변 글 작성시 참조
	BOARD_RE_LEV NUMBER, --답변 글의 깊이
	BOARD_RE_SEQ NUMBER, --답변 글의 순서
	BOARD_READCOUNT NUMBER, --글의 조회수
	BOARD_DATE DATE default sysdate,
	PRIMARY KEY(BOARD_NUM)
);

create table member(
	id varchar2(12),
	password varchar2(10),
	name varchar2(15),
	age number(2),
	gender varchar2(3),			--남, 여
	email varchar2(30),			--hta@hta.com
	memberfile varchar2(50),
	PRIMARY KEY(id)
);

create table comm(
 num number primary key,
 id varchar2(30) references member(id) ,
 content varchar2(200),
 reg_date date,
 comment_board_num number references board(board_num) on delete cascade, --원문글이 삭제되면 댓글도 삭제
 comment_re_lev number(1) check(comment_re_lev in (0,1,2)), --원문이면 0 답글이면1
 comment_re_seq number, --원문이면 0, 1레벨이면 1레벨 시퀀스 + 1
 comment_re_ref number --원문은 자기 글번호, 답글이면 원문 글번호
);
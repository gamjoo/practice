drop table board cascade constraints purge;
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

select * from board;
delete from board;
select * from comm;

insert into board (BOARD_NUM, BOARD_SUBJECT, BOARD_NAME, BOARD_RE_REF )
values(1, '처음', 'amdin', 1);
insert into board (BOARD_NUM, BOARD_SUBJECT, BOARD_NAME, BOARD_RE_REF )
values(2, '둘째', 'admin', 2);
insert into board (BOARD_NUM, BOARD_SUBJECT, BOARD_NAME, BOARD_RE_REF )
values(3, '셋째', 'admin', 3);

insert into comm (num, id, comment_board_num) values (1, 'admin', 1);
insert into comm (num, id, comment_board_num) values (2, 'admin', 1);
insert into comm (num, id, comment_board_num) values (3, 'admin', 2);
insert into comm (num, id, comment_board_num) values (4, 'admin', 2);

update board
set board_subject = '오늘도 행복하세요'
where board_num = 1;

-- 1.comm 테이블에서 comment_board_num별 갯수글 구한다.
select COMMENT_BOARD_NUM, COUNT(comment_board_num) CNT
from comm, board
group by comment_board_num;


--2. board 테이블과 join 한다.
BOARD_NUM     BOARD_SUBJECT     CNT
1			  오늘도 행복하세요		2
2			  둘쨰				2

select board_num, board_subject, cnt
from board join (select comment_board_num, count(*) cnt
				 from comm
				 group by comment_board_num)
on board_num=comment_board_num;

--문제점) 만약 board 테이블에는 글이 있지만 댓글이 없는 경우 조회가 되지 않는다.
--3.outer join을 이용해서 board의 글이 모두 표시되고 cnt가 null인 경우 0으로 표시되도록 한다.
BOARD_NUM     BOARD_SUBJECT     CNT
3			  세째				0
2			  둘쨰				2
1			  오늘도 행복하세요		2

--1단계) 게시판 글에 댓글이 없는 경우 cnt가 null이다
select board_num, board_subject, cnt
from board left outer join (select comment_board_num, count(*) cnt
							from comm
							group by comment_board_num)
on board_num=comment_board_num;

--2단계) cnt가 null인 경우 0으로 만든다.
select board_num, board_subject, nvl(cnt,0) as cnt
from board left outer join (select comment_board_num, count(*) cnt
							from comm
							group by comment_board_num)
on board_num=comment_board_num
order by BOARD_RE_REF desc, BOARD_RE_SEQ asc;
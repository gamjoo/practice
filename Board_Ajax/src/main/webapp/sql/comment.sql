drop table comm cascade constraints purge;

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
--게시판 글이 삭제되면 참조하는 댓글도 삭제된다.--

drop sequence com_seq;

create sequence com_seq;

delete comm;

select * from comm;


select m.memberfile, c.id, c.content, c.reg_date
from member m, COMM c
where m.id = c.id

--1.member에 있는 memberfile이 필요하다.
--2.order by comment_re_ref asc, comment_re_seq asc (등록순)
--3.order by comment_re_ref desc, comment_re_seq asc (최신순)
select comm.*, member.memberfile
from comm inner join member
on comm.id=member.id
where comment_board_num = ? --받아올 정보
order by comment_re_ref asc,
		 comment_re_seq asc;
		 

select *
from comm join member
on comm.id = member.id
where comment_board_num = 12
order by comment_re_ref asc, comment_re_seq asc;
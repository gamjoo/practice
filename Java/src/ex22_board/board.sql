select * from board;

delete from board;

drop sequence board_seq;
create sequence board_seq;


---- 게시판 페이징처리 SQL ----
SELECT *
FROM (
		SELECT ROWNUM RUM, S.* --별칭 S 테이블의 모든 컬럼
			FROM
				(SELECT BOARD_NUM, BOARD_NAME, BOARD_SUBJECT, BOARD_CONTENT,
				 BOARD_FILE, BOARD_ORIGINAL, BOARD_RE_REF, BOARD_RE_LEV, 
				 BOARD_RE_SEQ, BOARD_READCOUNT, BOARD_DATE
				 FROM BOARD
				 ORDER BY BOARD_RE_REF DESC, BOARD_RE_SEQ ASC
				 ) S
			WHERE ROWNUM <= 10
	)
WHERE RUM>=1 AND RUM <=10;


------ 삭제하기 전에 백업 -----
create table board_backup
as
select * from board;

select * from board_backup;

select count(*) from board;
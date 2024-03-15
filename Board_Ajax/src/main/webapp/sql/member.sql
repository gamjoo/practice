drop table member cascade constraints purge;
--1.index.jsp에서 시작한다.
--2.관리자 계정 admin, 비번1234를 만든다.
--3.사용자 계정을 3개 만든다.

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

--memberfile은 회원 정보 수정시 적용한다.

insert into MEMBER (id, password, name, age, gender, email, memberfile)
values ('admin', '1234', '김레오', 20, '남', 'jhta1234@naver.com', '');
insert into MEMBER (id, password, name, age, gender, email, memberfile)
values ('A1234', '1234', '김리오', 25, '여', 'A1234@naver.com', '');
insert into MEMBER (id, password, name, age, gender, email, memberfile)
values ('B1234', '1234', '크리스티나', 27, '여', 'B1234@naver.com', '');
insert into MEMBER (id, password, name, age, gender, email, memberfile)
values ('C1234', '1234', '아퀴나스', 22, '남', 'C1234@naver.com', '');

SELECT * from MEMBER;
----1.hakjum 테이블 만들기
create table hakjum (
	LOWSCORE NUMBER(3),
	HISCORE NUMBER(5,2),
	GRADE VARCHAR2(3) primary key
);

insert into hakjum
values(0,59.99,'F');
insert into hakjum
values(60,64.99,'D0');
insert into hakjum
values(65,69.99,'D+');
insert into hakjum
values(70,74.99,'C0');
insert into hakjum
values(75,79.99,'C+');
insert into hakjum
values(80,84.99,'B0');
insert into hakjum
values(85,89.99,'B+');
insert into hakjum
values(90,94.99,'A0');
insert into hakjum
values(95,100,'A+');

select * from hakjum;


----- 2.student 테이블 만들기 / 3.제약조건
create table student (
	NO NUMBER primary key,
	NAME VARCHAR2(21) not null,
	KOR NUMBER(3) not null CHECK(KOR between 0 and 100),
	MATH NUMBER(3) not null CHECK(MATH between 0 and 100),
	ENG NUMBER(3) not null CHECK(ENG between 0 and 100),
	TOT NUMBER(3),
	AVG NUMBER(5,2),
	GRADE VARCHAR2(3),
	FOREIGN KEY(GRADE) REFERENCES hakjum(GRADE)
);

----- 4.1부터 1씩 증가하는 시퀀스
CREATE sequence student_seq;
DROP sequence student_seq;


----- 5.테이블확인
SELECT * from student;
DELETE from student;


----- 6.등급구하기
SELECT S.GRADE
FROM hakjum H, student S
where H.LOWSCORE <= S.AVG
AND S.AVG <= H.HISCORE;
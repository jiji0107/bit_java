
##############################################
테이블 생성 DDL (DDL 명령은 취소가 안된다. 오토커밋)

테이블은 실제로 데이터들이 저장되는 곳 이라고 생각하면 쉽게 이해 할 수 있으며,
CREATE TABLE 명령어를 이용해서 테이블을 생성 할 수 있다.
##############################################


drop table book; -- 삭제하면 다시 복구 가능하지 않다. 이게 오토커밋 rollback해도 다시 안돌아온다.
create table book(  
	bookno 	number(5),
	title  	varchar2(30),
	author 	varchar2(30),
	pubdate date
);

select * from book;

insert into book values(1,'java','kim',sysdate);
insert into book values(2,'jsp','홍',sysdate);
insert into book values(2,'jsp','홍',sysdate);
insert into book values(2,'jsp','홍','19/02/02');


commit; -- 커밋을 해야 확정이 되고 취소가 불가능하다.
rollback; -- 테이블이 생성될때 까지 다 취소가 된다.


insert into book (bookno,title)values(3,'db');
insert into book (bookno,title,author,pubdate)values(4,'db',null,null);

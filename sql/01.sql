

alter user hr identified by hr account unlock;

sqlplus hr/hr

select * from tab;

conn system/1234
-- tablespace 생성
create tablespace bit
datafile 'c:\lib\bit.dbf'
size 30M
autoextend on next 2M maxsize UNLIMITED;

-- 계정 생성 test01/1234
create user test01 identified by 1234
default tablespace bit;

-- 권한부여 test01/1234
grant connect to test01;
select * from tab;

-- 권한회수 test01/1234
revoke connect from test01;

grant connect,resource to test01;

-- 계정 삭제
drop user test01 cascade;

-- 계정 생성 SCOTT/1234
create user SCOTT identified by TIGER
default tablespace bit;

@c:\lib\scoot.sql

show linesize;

set linesize 300;

show pagesize;
set pagesize 20;

--오라클 휴지통비우기
purge recyclebin;

select TABLESPACE_name from dba_tablespaces;

DROP TABLE DEPT;
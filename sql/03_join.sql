select * from EMP;

select
from
where -- 별칭 못쓴다.
order by -- 별칭 쓸 수 있다.


select ename,sal from EMP where deptno=10;

select ename,sal from EMP order by deptno ;

select ename,sal,deptno from EMP order by deptno ;



########################################
join
########################################
select ename,dname
from emp,dept; -- 기본키와 외래키 비교하는 조건문이 들어가야한다.

select ename,dname
from emp,dept
where emp.deptno = dept.deptno; -- emp에 있는 deptno와 dept에 있는 deptno가 같은걸 가져와라. table-1의 조건의 개수가 온다. 보통 =을 기준으로 앞이 프라이머리키 뒤가 폴인키


select ename,dname,deptno --deptno가 양쪽 테이블에 다있다.
from emp,dept
where emp.deptno = dept.deptno;

select ename,dname,dept.deptno  -- dept테이블에 있는 deptno이다. 
from emp,dept
where emp.deptno = dept.deptno;

select ename,dname,dept.deptno,loc  -- dept테이블에 있는 deptno이다. 
from emp,dept
where emp.deptno = dept.deptno;

select ename,dept.deptno as 부서번호,dname, loc  -- dept테이블에 있는 deptno이다. 
from emp e ,dept d -- emp테이블은 e dept 테이블은 d
where emp.deptno = dept.deptno; -- 위에서 어라이언스 시켜서 바꿔줘야한다.

select ename,d.deptno as 부서번호 ,dname, loc 
from emp e ,dept d
where e.deptno = d.deptno; 

select * --테이블을 완전히 합해버렸다.
from emp e ,dept d
where e.deptno = d.deptno; 

-- 급여가 2500이상인 정보 추출

select * --테이블을 완전히 합해버렸다.
from emp e ,dept d
where e.deptno = d.deptno and sal>2500;

#####################################
ANCI join 표준 , => join   where => on (안시 조인 문법)
#####################################
select ename,d.deptno ,dname, loc 
from emp e ,dept d
where e.deptno = d.deptno;  --오라클

오라클 join ==> 안시 join
select ename,d.deptno ,dname, loc 
from emp e join dept d
on e.deptno = d.deptno; 

## inner join => 양쪽 테이블에 모두 있는 내용 출력
select ename,d.deptno ,dname, loc 
from emp e inner join dept d --앞에 inner 생략
on e.deptno = d.deptno; 


select ename,d.deptno ,dname, loc 
from emp e inner join dept d
on e.deptno = d.deptno; 
where sal > 2500;

############################################
outer join
############################################
select * from emp;
select * from dept;

*** + null 쪽에 마킹
select ename,  sal, dname, loc, e.deptno
from emp e, dept d
where e.deptno(+) = d.deptno -- null쪽을 처리해주는 방식이 아우터 조인

select ename,  sal, dname, loc, e.deptno
from emp e, dept d
where e.deptno = d.deptno(+) --이렇게하면 처리가 안된다.

select ename,  sal, dname, loc, e.deptno
from emp e ,  dept d
where e.deptno = d.deptno(+)  --오라클 방식

## right 쪽이 마스터(기준이된다.) 즉 dept 테이블이 마스타 테이블이 되어 모두 출력
select ename,  sal, dname, loc, e.deptno
from emp e right outer join dept d -- emp로 마스터 할거면 left 조인  , dept로 마스터 하거면 right 조인
on e.deptno = d.deptno  -- 안시 방식

## right 쪽이 마스터(기준이된다.) 즉 dept 테이블이 마스타 테이블이 되어 모두 출력
select ename,  sal, dname, loc, e.deptno
from emp e left outer join dept d -- emp로 마스터 할거면 left 조인 
on e.deptno = d.deptno  -- 안시 방식

########################################################
non -equi join
########################################################

select * from salgrade;

select ename,sal,grade
from emp e , salgrade s
where sal between losal and hisal; -- 등급

select ename,sal,grade
from emp e join salgrade s
on sal between losal and hisal; 

######################################################
세개의 테이블 조인
######################################################


select ename, sal , dname, loc, grade
from emp,dept,salgrade  -- ename , sal은 emp 테이블 dname , loc은 dept테이블
where emp.deptno = dept.deptno and sal between losal and hisal  --emp와 deptno dept에 deptno가 같아야 한다.
order by deptno;

select ename, sal , dname, loc, grade
from emp,dept,salgrade  -- ename , sal은 emp 테이블 dname , loc은 dept테이블
where emp.deptno = dept.deptno and sal between losal and hisal  --emp와 deptno dept에 deptno가 같아야 한다.
order by emp.deptno; -- deptno는 양쪽에 있으니까 어딘지 꼭 써주어야 한다.

select ename, sal , dname, loc, grade
from emp,dept,salgrade  -- ename , sal은 emp 테이블 dname , loc은 dept테이블
where emp.deptno = dept.deptno and sal between losal and hisal and emp.deptno=20 --emp와 deptno dept에 deptno가 같아야 한다. deptno가 20
order by emp.deptno;

select ename, sal , dname, loc, grade
from emp join dept  -- ename , sal은 emp 테이블 dname , loc은 dept테이블
on emp.deptno = dept.deptno   --emp와 deptno dept에 deptno가 같아야 한다.
join salgrade 
on sal between losal and hisal
order by emp.deptno; -- 안시 조인

select ename, sal , dname, loc, grade
from emp join dept  -- ename , sal은 emp 테이블 dname , loc은 dept테이블
on emp.deptno = dept.deptno   --emp와 deptno dept에 deptno가 같아야 한다.
join salgrade 
on sal between losal and hisal
where emp.deptno = 10 -- 테이블 조인이 아니여서 따로 where 
order by emp.deptno;


###############################################################
self join
###############################################################
select e.empno, e.ename 사원명, m.empno ,m.ename 상사명
from emp e , emp m -- emp 하나는 e라고 하고 하나는 m 이라고 한다.
where e.mgr = m.empno;

select e.empno, e.ename 사원명, e.mgr, m.empno ,m.ename 상사명
from emp e , emp m -- emp 하나는 e라고 하고 하나는 m 이라고 한다. 중간에 mgr을 넣어준다.
where e.mgr = m.empno(+); -- null쪽에 마킹을 해라

select e.empno, e.ename 사원명, e.mgr, m.empno ,m.ename 상사명
from emp e inner join emp m -- emp 하나는 e라고 하고 하나는 m 이라고 한다.
on e.mgr = m.empno; -- 안시조인

select e.empno, e.ename 사원명, m.ename 상사명
from emp e left outer join emp m -- emp 하나는 e라고 하고 하나는 m 이라고 한다.
on e.mgr = m.empno; -- 안시조인

select e.empno, e.ename 사원명 ,nvl(m.ename,'<CEO>') 상사명
from emp e left outer join emp m 
on e.mgr = m.empno; 

## 상사보다 급여가 많은 사원 목록

select  e.ename , e.sal , m.ename , m.sal
from emp e join emp m
on e.mgr = m.empno -- e는 사원 m은 상사
where e.sal > m.sal




select  e.ename , e.sal , dname,loc ,  m.ename , m.sal 
from emp e
join emp m
on e.mgr = m.empno -- e는 사원 m은 상사
join dept
on e.deptno = dept.deptno
where e.sal > m.sal;

###############################################
집계함수
###############################################
select ename, round(sal) from emp;
select avg(sal) from emp; --집계함수 emp테이블의 값이 다 더해지고 나눠줘서 평균 
select ename, avg(sal) from emp; -- 사원들의 평균이 아니라 회사의 총평균이라 안된다.


select round(avg(sal)) 평균급여 from emp;

select count(empno), count(comm), count(*),count(mgr), round(avg(sal)) 평균급여 from emp;

select count(job) from emp;
select count(distinct job) from emp; --중복제거

select sum(sal), count(*), round(avg(sal)),sum(sal)/count(*) from emp;

select round(avg(sal)) 평균급여 from emp;
select round(avg(sal)) 평균급여 from emp where deptno = 10; -- 10번 부서의 평균급여
select round(avg(sal)) 평균급여 from emp where deptno = 20;
select round(avg(sal)) 평균급여 from emp where deptno = 30;

select * from emp order by deptno;

select round(avg(sal)) 평균급여
from emp
group by deptno;

select deptno,round(avg(sal)) 평균급여 --어디의 평균급여 인지 모르니까 deptno를 붙인다.
from emp
group by deptno;--group by를 쓰면 집계함수를 쓰겠다는 말이다. groub by 다음 연도, 부서번호 이런게 와야한다. 그룹바이에 참여한 절만 위에 나열이 가능하다 deptno가 
-- 그룹바이 뒤에 있으니까. select 옆에 deptno 사용가능 다른 집계함수는 허용 가능하지 않다.


select
from 
where
group by
having
order by


## 부서 이름 별 평균 급여 ##

select emp.deptno, dname,round(avg(sal)) 평균급여 --어디의 평균급여 인지 모르니까 deptno를 붙인다.
from emp , dept
where emp.deptno = dept.deptno
group by dname, emp.deptno
order by 1;

select max(sal), min(sal), count(*), avg(sal) from emp;


select deptno, max(sal), min(sal), count(*), avg(sal) 
from emp
group by deptno;-- 집계 함수는 group by 절과 사용

select emp.deptno, dname,round(avg(sal)) 평균급여 --어디의 평균급여 인지 모르니까 deptno를 붙인다.
from emp 
join dept
on emp.deptno = dept.deptno
group by dname, emp.deptno
order by 1; 


## 부서별 평균 급여가 2000이상인 부서 리스트 -- 그룹바이 이후에 나온 조건 having절은 그룹바이 뒤에 쓴다.

select emp.deptno, dname,round(avg(sal)) 평균급여 --어디의 평균급여 인지 모르니까 deptno를 붙인다.
from emp 
join dept
on emp.deptno = dept.deptno
group by dname, emp.deptno
having avg(sal) > 2000
order by 1; 

#####################################
#select								#
#from 								#
#where								#
#group by							#
#having								#
#order by							#
#####################################

select emp.deptno, dname,round(avg(sal)) 평균급여 --어디의 평균급여 인지 모르니까 deptno를 붙인다.
from emp 
join dept
on emp.deptno = dept.deptno
where sal > 1000 -- 1000이하이면 아예 제외된다.
group by dname, emp.deptno
having avg(sal) > 2000
order by 1; 


#########################################
sub Query    select 안에 select가 들어간다.
#########################################
## FORD 보다 급여를 많이 받는 사원 리스트

select sal from emp where ename = 'FORD'; --ford급여 3000

select * from emp where sal > 3000;

select * from emp where sal > (select sal from emp where ename = 'FORD');

##평균 급여보다 적게 받는 사원 목록

select * from emp where sal < (select avg(sal) from emp); -- 집계 함수

select * from emp where sal = (select min(sal) from emp); -- 급여를 제일 작게 받는 사람
select * from emp where sal = (select max(sal) from emp);

#################################
스칼라 = 단일값  백터 = 다중값   --둘의 차이점은 통계를 하려면 데이터가 많아야 통계의 기본이니까 R은 백터 기반의 프로그래밍 언어 =은 스칼라 in은 백터(값이 여러개 이니까)
#################################

## 각각의 부서에서 급여가 가장 작은 사원 리스트 
select deptno, ename, sal from emp where sal in(select min(sal) from emp group by deptno);

## 각각의 부서에서 급여가 가장 많은 사원 리스트
select deptno, ename, sal from emp where sal in(select  max(sal) from emp group by deptno);

select deptno, ename, sal from emp where (deptno,sal) in(select deptno, max(sal) from emp group by deptno); 
################################################################
상관관계 서브쿼리 : outer 쿼리의 컬럼 중 하나가 inner 쿼리문에서 사용되는 쿼리
################################################################

## 자신이 속한 부서의 평균 급여보다 적은 사원 리스트
select * from emp outer where sal < (select avg(sal) from emp where deptno = outer.deptno); -- outer의 부서번호를 끌어와서 그 부서의 평균 급여를 구하겠다.

###########################################
rownum => row마다 number가 매겨진다.
###########################################

select rownum, ename, sal, hiredate
from emp;

## 급여에서 top3를 뽑고싶다

select rownum, ename, sal, hiredate
from emp
order by sal desc;

select rownum, ename, sal, hiredate
from (select * from emp order by sal desc) -- 정렬한 다음에 그 테이블을 가지고 rownum을 뽑아낸다.
where rownum < 4;

## 주의 
select rownum, ename, sal, hiredate
from (select * from emp order by sal desc) -- 정렬한 다음에 그 테이블을 가지고 rownum을 뽑아낸다. from절 뒤에 서브쿼리가 오면 그 서브쿼리가 테이블 처럼 된다.
where rownum > 4; --1부터 만들어지기 때문에 갑자기 4부터 시작 될 수 없다.

select rownum, ename, sal, hiredate
from (select * from emp order by sal desc) 
where rownum < 4; -- 안된다.

select rownum, ename, sal, hiredate
from (select * from emp order by sal desc) 
where rownum between 1 and 4;  --된다.

select rownum, ename, sal, hiredate
from (select * from emp order by sal desc) -- 정렬한 다음에 그 테이블을 가지고 rownum을 뽑아낸다.
where rownum between 4 and 7; -- 1부터 접근은 되지만 4부터 접근은 안된다.


################################################
page 처리 --중간부터 접근이 가능해야 한다.
################################################

select * from ( -- rownum이 row#으로 바뀐것이다. 
select rownum row#, ename, sal, hiredate
from (select * from emp order by sal desc) 
)
where row# between 11 and 15;  


						start       end
1page 1~5				5*0+1        +4
2page 6~10				5*1+1        +4
3page 11~15				5*2+1		 +4





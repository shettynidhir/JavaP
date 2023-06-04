//QUERIES
select * from emp;   //1

select distinct(job) from emp;  //2

select * from emp where job='MANAGER';  //3

select * from emp where hiredate<('01-01-81');  //4

select empno, ename, job, hiredate,TO_NUMBER(TO_CHAR(TO_DATE(hiredate, 'DD-MM-YY'), 'YYYY'))-TO_NUMBER(TO_CHAR(sysdate, 'YYYY'))as experience  from emp where job='MANAGER';  //5
--select empno,ename,job, sysdate - hiredate exp from emp where job='MANAGER';

select empno,ename,sal, TO_NUMBER(TO_CHAR(TO_DATE(hiredate, 'DD-MM-YY'), 'YYYY'))-TO_NUMBER(TO_CHAR(sysdate, 'YYYY'))as experience from emp where MGR=7839;  //6

select * from emp where comm>sal;  //7

select empno,ename, TO_NUMBER(TO_CHAR(TO_DATE(hiredate, 'DD-MM-YY'), 'YYYY'))-TO_NUMBER(TO_CHAR(sysdate, 'YYYY'))as experience from emp where sal/30>100;  //8

select ename from emp where deptno in(10,20);  //9

select * from emp where mgr in(select empno from emp where job='MANAGER');  //10

select * from emp where job='CLERK' and  deptno=20;  //11

select * from emp where ename='SMITH';   //12

select empno,ename,deptno from emp;  //13

select empno,deptno from emp;  //14

select distinct(dname) from dept;  //15

select * from emp where (sal+sal*0.2) > 3000;   //16

select ename, sal, to_char(sal+sal*0.15,'$99,999.000') "Sal in Dollars" from emp;  //17

select ename || ' works as ' || job "EMP_AND_JOB" from emp;  //18

select empno,ename,sal from emp where job='MANAGER';  //19

select empno,ename,sal,AnnualSalary from(select empno,ename,sal,nvl2(comm,(sal+comm)*12,sal*12) as AnnualSalary from emp ) where AnnualSalary>30000;   //20

select count(empno) as TotalEmployee, count(distinct(empno)) "Distict count of employee" from emp;      //21

select empno,sal,comm from emp;  //22

select distinct job,deptno from emp;  //23

select * from emp where ename='BLAKE';  //24

select * from emp where job='CLERK';  //25

select * from emp where hiredate='01-05-81';  //26

select * from emp where sal<3500;  //27

select empno,ename,sal from emp  where hiredate<'01-04-81';  //28

select empno,ename from(select empno,ename, TO_NUMBER(TO_CHAR(TO_DATE(hiredate, 'DD-MM-YY'), 'YYYY'))-TO_NUMBER(TO_CHAR(sysdate, 'YYYY'))as experience from emp) where experience>10;   //29

select * from emp where job='MANAGER';  //30

select empno,ename from(select empno,ename,job, TO_NUMBER(TO_CHAR(TO_DATE(hiredate, 'DD-MM-YY'), 'YYYY'))-TO_NUMBER(TO_CHAR(sysdate, 'YYYY'))as experience from emp) where experience>8 and job='CLERK';   //31

select empno,ename,sal,job,AnnualSalary from ( select empno,ename,sal,job,nvl2(comm,(sal+comm)*12,sal*12) as AnnualSalary from emp) where AnnualSalary<34000  and job='SALESMAN' and comm>0 and comm<sal and deptno=20;   //32  -- doubt

select * from emp where job='SALESMAN' and comm>0;  //33

select * from emp where deptno=30 and job='SALESMAN' and comm>sal;  //34

select 
 
--select * from emp fetch first 5 rows only;
select * from emp where rownum<=5;   //36

select empno,ename,job,sal from emp; //37

select distinct(deptno) from emp;  //38

select distinct(job), deptno from emp;  //39

select * from emp where ename='MILLER';  //40

select * from dept where deptno=10;  //41

select * from emp where job='SALESMAN';  //42

select * from emp where hiredate<'01-01-84';  //43

select * from emp where sal>2500;  //44

select * from emp where hiredate>'01-04-82';  //45

select empno,ename,sal,round(sal/30,2) "Daily Salary" from emp;   //46

select empno,ename,sal,TO_NUMBER(TO_CHAR(TO_DATE(hiredate, 'DD-MM-YY'), 'YYYY'))-TO_NUMBER(TO_CHAR(sysdate, 'YYYY'))as experience from emp where job='ANALYST';  //47;

select * from emp where TO_NUMBER(TO_CHAR(TO_DATE(hiredate, 'DD-MM-YY'), 'YYYY'))-TO_NUMBER(TO_CHAR(sysdate, 'YYYY')) > 6.5;  //48

select * from emp where hiredate>'01-06-81';  //49

select * from emp where job='CLERK' and deptno=10;  //50

select * from emp where hiredate<'01-01-85' and sal>3000;   //51



























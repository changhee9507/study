/*
WHERE NOT
NOT IN
NOT LIKE
NOT BETWEEN A AND B 등으로 이용할 수 있다. */

SELECT EMPNO,ENAME,DEPTNO
FROM EMP
WHERE NOT DEPTNO = 30; /* WHERE 다음 이어지며 DEPTNO != 30과 같은 의미가 된다. */


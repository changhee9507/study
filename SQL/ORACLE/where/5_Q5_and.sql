SELECT ENAME, EMPNO, SAL, DEPTNO
FROM EMP
WHERE ENAME LIKE '%E%'
AND DEPTNO = 30
AND SAL NOT BETWEEN 1000 AND 2000; 
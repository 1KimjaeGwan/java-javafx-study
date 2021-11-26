
USE smart_web_test;


DELIMITER // 
CREATE PROCEDURE test_1()
	BEGIN
		SELECT e.empno, e.ename, d.dname FROM emp e NATURAL JOIN dept d
        WHERE e.sal >= 2000 ORDER BY d.dname;
    END // 
DELIMITER ;

DELIMITER // 
CREATE PROCEDURE test1_2(
IN _empno INT,
IN _deptno INT
)
	BEGIN
		SELECT * FROM emp WHERE empno = _empno;
        UPDATE emp SET deptno = _deptno WHERE empno = 7369;
    END //
DELIMITER ;

CALL test1_2(7369,10);

DESC emp;
CREATE TABLE back_up_emp(
 SELECT * FROM emp WHERE 1=0
);

DESC back_up_emp;
SELECT * FROM back_up_emp;

DELIMITER // 
CREATE TRIGGER before_emp
		AFTER DELETE
        ON emp
        FOR EACH ROW
	BEGIN
		INSERT INTO back_up_emp(empno,ename,job,mgr,hiredate,sal,comm,deptno)
        VALUES(OLD.empno,OLD.ename,OLD.job,OLD.mgr,OLD.hiredate,OLD.sal,OLD.comm,OLD.deptno);
    END //
DELIMITER ;

SELECT * FROM emp;

DELETE FROM emp WHERE empno = 7369;
SELECT * FROM back_up_emp;


SELECT deptno, count(*) AS '부서별인원' FROM emp GROUP BY deptno WITH ROLLUP;


CREATE USER testUser@'localhost' IDENTIFIED BY '12345';
SELECT * FROM mysql.user where user = 'testUser';

GRANT SELECT, INSERT, UPDATE, DELETE ON smart_web_test.* TO testUser@'localhost';
SHOW GRANTS FOR testUser@'localhost';
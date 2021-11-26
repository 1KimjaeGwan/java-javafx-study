USE smart_web_test;
show tables;

SELECT * FROM student;

UPDATE student SET stu_height = 180 WHERE stu_name = '박희철';
UPDATE student SET stu_height = 173 WHERE stu_name = '김종헌';

DELETE FROM student WHERE stu_no = '20142021';

DELETE FROM student;
rollback;

show tables;

DESC student;
DESC subject;
DESC enrol;

ALTER TABLE student ADD INDEX seq_in_index(stu_name);
SHOW INDEXES FROM student;

SELECT * FROM enrol;
SELECT * FROM subject;

SELECT s.stu_no, s.stu_name, e.enr_grade FROM student s NATURAL JOIN enrol e;

CREATE TABLE t_student
(SELECT * FROM student WHERE stu_dept = '기계');

SELECT * FROM t_student;

show tables;
SELECT * FROM emp;
SELECT * FROM dept;







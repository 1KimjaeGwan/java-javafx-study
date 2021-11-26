CREATE DATABASE smart_web_test;

CREATE TABLE IF NOT EXISTS student(
	stu_no INT(11) PRIMARY KEY NOT NULL,
	stu_name VARCHAR(12),
    stu_dept VARCHAR(20),
    stu_grade INT(1),
    stu_class CHAR(1),
    stu_gender CHAR(1),
    stu_height FLOAT(5,2),
    stu_weight FLOAT(5,2)
);

CREATE TABLE IF NOT EXISTS enrol(
	sub_no CHAR(3),
    stu_no INT(9),
    enr_grade INT(3),
    FOREIGN KEY (stu_no) REFERENCES student(stu_no),
    FOREIGN KEY (sub_no) REFERENCES subject(sub_no)
);

CREATE TABLE IF NOT EXISTS subject(
	sub_no CHAR(3) PRIMARY KEY,
	sub_name VARCHAR(30) NOT NULL,
    sub_prof VARCHAR(12) NOT NULL,
    sub_grade INT(1) NOT NULL,
    sub_dept VARCHAR(20) NOT NULL
);

INSERT INTO student VALUES('20143054','유가인','기계',2,'C','F','154.00','47.00');
INSERT INTO student VALUES('20153075','옥한빛','기계',1,'C','M','177.00','80.00');
INSERT INTO student VALUES('20153088','이태연','기계',1,'C','F','162.00','50.00');
INSERT INTO student VALUES('20132003','박희철','전기전자',3,'B','M',null,'63.00');
INSERT INTO student VALUES('20142021','심수정','전기전자',2,'A','F','168.00','45.00');
INSERT INTO student VALUES('20152088','조민우','전기전자',1,'C','M','188.00','90.00');
INSERT INTO student VALUES('20131001','김종헌','컴퓨터정보',3,'C','M',null,'72.00');
INSERT INTO student VALUES('20131025','옥성우','컴퓨터정보',3,'A','F','172.00','63.00');
INSERT INTO student VALUES('20141007','진현무','컴퓨터정보',2,'A','M','174.00','64.00');
INSERT INTO student VALUES('20151062','김인중','컴퓨터정보',1,'B','M','166.00','67.00');

commit;
create table dept
(
    dept_id   int          not null,
    dept_name varchar(100) null
);

INSERT INTO laydb.dept (dept_id, dept_name) VALUES (100, '开发一部');
INSERT INTO laydb.dept (dept_id, dept_name) VALUES (200, '开发二部');
INSERT INTO laydb.dept (dept_id, dept_name) VALUES (300, '运营一部');
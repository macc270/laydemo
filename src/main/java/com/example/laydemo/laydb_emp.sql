create table emp
(
    emp_id   int auto_increment
        primary key,
    name     varchar(100) null,
    sex      varchar(20)  null,
    age      int          null,
    sal      int          null,
    birthday date         null,
    address  varchar(200) null,
    dept_id  int          null
);

INSERT INTO laydb.emp (emp_id, name, sex, age, sal, birthday, address, dept_id) VALUES (1, '张三风', 'M', 99, 9999, '2021-07-06', '西安市长安区郭杜街道888号', 100);
INSERT INTO laydb.emp (emp_id, name, sex, age, sal, birthday, address, dept_id) VALUES (2, '李四风', 'F', 18, 2800, '2021-07-06', '西安市长安区过度街道888号', 200);
INSERT INTO laydb.emp (emp_id, name, sex, age, sal, birthday, address, dept_id) VALUES (3, '王五风', 'M', 23, 3500, '2021-07-06', '西安市长安区郭杜街道888号', 100);
INSERT INTO laydb.emp (emp_id, name, sex, age, sal, birthday, address, dept_id) VALUES (4, '赵六风', 'F', 30, 6500, '2021-07-01', '西安市长安区郭杜街道888号', 200);
INSERT INTO laydb.emp (emp_id, name, sex, age, sal, birthday, address, dept_id) VALUES (5, '张德华', 'M', 58, 8800, '2021-07-06', '西安市长安区郭杜街道888号', 300);
INSERT INTO laydb.emp (emp_id, name, sex, age, sal, birthday, address, dept_id) VALUES (6, '陈晓有', 'F', 60, 9800, '2021-07-06', '西安市长安区郭杜街道888号', 100);
INSERT INTO laydb.emp (emp_id, name, sex, age, sal, birthday, address, dept_id) VALUES (19, '赵三狗', 'F', 23, 21234, '2022-05-03', '西安市雁塔区长安中路', 100);
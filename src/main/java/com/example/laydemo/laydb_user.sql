create table user
(
    id       int auto_increment
        primary key,
    username varchar(50)  null,
    password varchar(100) null,
    ch_name  varchar(50)  null
);

INSERT INTO laydb.user (id, username, password, ch_name) VALUES (1, 'admin', '$2a$10$z6oMxJ6pl44G1jfoleu.uex5jqpwRd.njN6fq9F4zcWN5PzlWpl7a', '管理员');
INSERT INTO laydb.user (id, username, password, ch_name) VALUES (2, 'zhangsan', '$2a$10$z6oMxJ6pl44G1jfoleu.uex5jqpwRd.njN6fq9F4zcWN5PzlWpl7a', '张三');
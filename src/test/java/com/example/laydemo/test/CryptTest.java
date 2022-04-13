package com.example.laydemo.test;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.DigestUtils;

public class CryptTest {

    @Test
    public void test() {
        //md5 spring提供的加密方法，加盐得自己处理
        String s1 = DigestUtils.md5DigestAsHex("123456".getBytes());
        String s2 = DigestUtils.md5DigestAsHex("123456".getBytes());
        System.out.println(s1);
        System.out.println(s2);

        //spring安全框架提供的加密方法，可以自动加盐，无需自己保存盐
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encode1 = passwordEncoder.encode("123456");
        String encode2 = passwordEncoder.encode("123456");
        System.out.println(encode1);
        System.out.println(encode2);

        //验证
        boolean matches1 = passwordEncoder.matches("123456", "$2a$10$Fci6eHsz9ayuns6GAQtaRe1dM2hPa4.v6kaDAKy5V7d4arSiyszVi");
        boolean matches2 = passwordEncoder.matches("123456", "$2a$10$z6oMxJ6pl44G1jfoleu.uex5jqpwRd.njN6fq9F4zcWN5PzlWpl7a");
        System.out.println(matches1);
        System.out.println(matches2);
    }
}

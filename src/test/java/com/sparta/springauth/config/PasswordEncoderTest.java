package com.sparta.springauth.config;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@SpringBootTest
class PasswordEncoderTest {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Test
    @DisplayName("수동 등록한 passwordEncoder를 주입 받아와 문자열 암호화")
    void test1() {
        String password = "password";

        // 암호화
        String encodedPassword = passwordEncoder.encode(password);
        System.out.println("encodedPassword = " + encodedPassword);

        String inputPassword = "password123";

        // 복화하를 통해 암호화된 비밀번호화 비교
        boolean matches = passwordEncoder.matches(inputPassword, encodedPassword);
        System.out.println("matches = " + matches); // false
    }

}
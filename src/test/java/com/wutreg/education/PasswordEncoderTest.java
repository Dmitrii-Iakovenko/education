package com.wutreg.education;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderTest {

    @Test
    void encode_password() {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("123456"));
//        $2a$10$9Ja1fdxt7tHLoBJ3i.xhS.7lgjkd08zPIuepbcwGJcRS3p4u3oR5a
    }
}

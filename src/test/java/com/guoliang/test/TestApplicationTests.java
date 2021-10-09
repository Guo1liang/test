package com.guoliang.test;

import com.guoliang.test.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {

    @Test
    void contextLoads() throws Exception {
        int i = 123;
        String s = "123";
        User user = new User();
        if (user.getApprove_status() == null) {
            System.out.println("is null");
        }
        if (user.getApprove_status() != null) {
            System.out.println("is not null");
        }
        System.out.println(1);
    }

}

package com.guoliang.test;

import com.guoliang.test.service.Impl.UserServiceImpl;
import com.guoliang.test.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {

    @Test
    void contextLoads() throws Exception {
        UserServiceImpl userService = new UserService();

        System.out.println(userService.get1());
        System.out.println(userService.get2());
    }

}

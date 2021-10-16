package com.guoliang.test.controller;


import com.guoliang.test.entity.Rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class test {

    @GetMapping("/test")
    public Rest<Date> test() {
        return new Rest<>("200", new Date(), "ok");
    }

}

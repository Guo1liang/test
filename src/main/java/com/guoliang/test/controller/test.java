package com.guoliang.test.controller;


import com.guoliang.test.entity.Rest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Date;

@RestController
@CrossOrigin
public class test {

    @GetMapping("/test")
    public Rest test() throws IOException {

        return new Rest("200", new Date(), "ok" );
    }

}

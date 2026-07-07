package com.example.helloworld;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @DeleteMapping("/hello")
    public String hello() {
        return "Hello";
    }
}

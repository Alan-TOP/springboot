package com.alan.springboot.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value = "/hello" )
    public String index() {
        return "hello world中国";
    }
}

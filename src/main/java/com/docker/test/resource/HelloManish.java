package com.docker.test.resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Name/Manish")
public class HelloManish {

    @GetMapping
    public String hello () {

        return "Hello Manish" ;
    }
}

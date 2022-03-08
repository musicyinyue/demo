package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/test")
public class aaaController {
    @RequestMapping("/hello")
    public String test() {
        System.out.print("First MVC test");
        return "Hello World !!";
    }
}

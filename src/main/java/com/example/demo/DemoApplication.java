package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("/name")
    String homeName() {
        return "Hello name";
    }

    @RequestMapping("/newname")
    String homeNewName() {
        return "Hello newname new change";
    }

    @RequestMapping("/webhook")
    String webhook() {
        return "Hello webhook new cha11nge";
    }

}
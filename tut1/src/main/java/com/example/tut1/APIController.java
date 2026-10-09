package com.example.tut1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
    @GetMapping("/home")
    public String home() {
        return "Hello World";
    }

    @GetMapping("/info")
    public String info() {
        return "ver. 1.0.0";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "Goodbye from Spring Boot";
    }

    @GetMapping("/test/{username}")
    public String test(@PathVariable String username) {
        if(username.equals("John")) {
            return "Access Denied :(";
        }
        else {
            return "Access Allowed :(";
        }
    }
}
